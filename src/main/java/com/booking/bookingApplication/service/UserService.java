package com.booking.bookingApplication.service;

import com.booking.bookingApplication.entity.Users;
import com.booking.bookingApplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public String saveUser(Users users) {
        if(users!=null)
        {
            userRepo.save(users);
            return "Success";
        }
        return "Failure";
    }

    public List<Users> getAllUsers() {
        List<Users> user= userRepo.findAll();
        return user;
    }
}
