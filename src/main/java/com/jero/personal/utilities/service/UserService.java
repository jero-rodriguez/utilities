package com.jero.personal.utilities.service;

import com.jero.personal.utilities.exception.ControlledApiException;
import com.jero.personal.utilities.model.User;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Find all list.
     *
     * @return the list
     */
    List<User> findAll();

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     * @throws ControlledApiException the controlled api exception
     */
    User findById(int id) throws ControlledApiException;

    /**
     * Add user.
     *
     * @param user the user
     * @return the user
     * @throws ControlledApiException the controlled api exception
     */
    User add(User user) throws ControlledApiException;

    /**
     * Delete user.
     *
     * @param id the id
     * @return the user
     */
    User delete(int id);

    /**
     * Update user.
     *
     * @param user the user
     * @return the user
     */
    User update(User user);


}
