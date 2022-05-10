package com.app.springboot.banking.BankingApp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerid;

    @Column(name = "first_name",nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "account_number",nullable = false,length = 15)
    private Long accountNumber;

    @Column(name = "email_id",nullable = false,unique = true,length = 30)
    private String emailId;

    @Column(name= "password",nullable = false, length=64)
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name= "mobile_number",nullable = false,unique = true,length=10)
    private Long MobileNumber;

    @Column(name= "address",length = 50)
    private String address;

    @Column(name = "city")
    private String city;

}
