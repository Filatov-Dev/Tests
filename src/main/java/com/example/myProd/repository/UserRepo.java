package com.example.myProd.repository;

import com.example.myProd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    public User findUserById(int id);
    public void deleteUserById(int id);

}
