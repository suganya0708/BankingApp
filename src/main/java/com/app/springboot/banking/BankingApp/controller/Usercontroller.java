package com.app.springboot.banking.BankingApp.controller;


import com.app.springboot.banking.BankingApp.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




@Controller
public class Usercontroller {

    @Autowired
    private UserserviceImpl userservice;

   @GetMapping("/")
    public String register(){
        return "register";
   }



}
