package com.jero.personal.utilities.service;

import org.springframework.data.repository.CrudRepository;

import com.jero.personal.utilities.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(long id);

    User add(User user);

    User delete(long id);

    User update(User user);


}
