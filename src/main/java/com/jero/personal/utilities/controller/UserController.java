package com.jero.personal.utilities.controller;

import com.jero.personal.utilities.exception.ControlledApiException;
import com.jero.personal.utilities.model.User;
import com.jero.personal.utilities.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type User controller.
 */
@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    @GetMapping(path = "/", produces = "application/json")
    @ResponseBody
    public List<User> getAllUsers() {
        return this.userService.findAll();
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        try {
            return this.userService.findById(id);
        } catch (ControlledApiException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Add user user.
     *
     * @param user the user
     * @return the user
     */
    @PostMapping(path = "/", consumes = "application/json")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        try {
            return this.userService.add(user);
        } catch (ControlledApiException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Delete user user.
     *
     * @param id the id
     * @return the user
     */
    @DeleteMapping(path = "/{id}", produces = "application/json")
    @ResponseBody
    public User deleteUser(@PathVariable int id) {
        return this.userService.delete(id);
    }

    /**
     * Update user user.
     *
     * @param user the user
     * @return the user
     */
    @PatchMapping(path = "/", consumes = "application/json")
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        return this.userService.update(user);
    }
}
