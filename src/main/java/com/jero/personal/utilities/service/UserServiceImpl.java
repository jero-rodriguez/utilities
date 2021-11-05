package com.jero.personal.utilities.service;

import com.jero.personal.utilities.model.User;
import com.jero.personal.utilities.repository.UserRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User delete(long id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
