package com.jero.personal.utilities.controller;

import java.util.List;

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

import com.jero.personal.utilities.model.User;
import com.jero.personal.utilities.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/", produces = "application/json")
    @ResponseBody
    public List<User> getAllUsers() {
        return this.userService.findAll();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        return this.userService.findById(id);
    }

    @PostMapping(path = "/", consumes = "application/json")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        return this.userService.add(user);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    @ResponseBody
    public User deleteUser(@PathVariable int id) {
        return this.userService.delete(id);
    }

    @PatchMapping(path = "/", consumes = "application/json")
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        return this.userService.update(user);
    }
}
