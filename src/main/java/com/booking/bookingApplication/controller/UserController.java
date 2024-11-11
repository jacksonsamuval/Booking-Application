package com.booking.bookingApplication.controller;

import com.booking.bookingApplication.entity.Users;
import com.booking.bookingApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello()
    {
        return "Hello";
    }

    @PostMapping("/register")
    public String saveUser(@RequestBody Users users)
    {
        return userService.saveUser(users);
    }

    @GetMapping("/allUsers")
    public List<Users> getAllUser()
    {
        return userService.getAllUsers();
    }

}
