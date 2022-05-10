package com.app.springboot.banking.BankingApp.Repo;

import com.app.springboot.banking.BankingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository< User, Long> {
}
