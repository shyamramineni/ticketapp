package com.shyam.ticketapp.controller;


import com.shyam.ticketapp.entity.User;
import com.shyam.ticketapp.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping
    public User save(@RequestBody User user){
        return userDao.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userDao.findAll().forEach(users::add);
        return users;
    }
    @GetMapping("/{id}")
    public User findUser(@PathVariable String id){
        return userDao.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userDao.deleteById(id);
        return "User Deleted";
    }



}
