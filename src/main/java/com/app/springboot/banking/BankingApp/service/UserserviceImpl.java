package com.app.springboot.banking.BankingApp.service;

import com.app.springboot.banking.BankingApp.Repo.UserRepo;

import com.app.springboot.banking.BankingApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserserviceImpl implements Userservice{

     @Autowired
     private UserRepo userRepo;

    @Override
    public void registerUser(User user) {
        userRepo.save (user);
    }
}
