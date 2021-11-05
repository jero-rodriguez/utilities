package com.jero.personal.utilities.service;

import com.jero.personal.utilities.exception.ControlledApiException;
import com.jero.personal.utilities.model.User;
import com.jero.personal.utilities.repository.UserRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        var iterable = userRepository.findAll();

        var users = new ArrayList<User>();
        iterable.forEach(users::add);

        if (log.isDebugEnabled()) {
            log.debug("Found {} elements.", users.size());
        }

        return users;
    }

    @Override
    public User findById(int id) throws ControlledApiException {
        var user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new ControlledApiException(String.format("User with id %s not found in database.", id), new Exception("Not Found"));
        }
    }

    @Override
    public User add(User user) throws ControlledApiException {
        if (userRepository.existsById(user.getId())) {
            throw new ControlledApiException(String.format("User with id %s is currently saved in database", user.getId()), new Exception("Duplicated Id"));
        }

        try {
            userRepository.save(user);
        } catch (Exception ex) {
            log.error("Error saving user {}", user);
            return null;
        }

        return user;
    }

    @Override
    public User delete(int id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
