package com.example.myProd.DAO;

import com.example.myProd.model.User;
import com.example.myProd.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOimp implements UserDAO{
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> showAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User showUserInfo(int id) {
        return userRepo.findUserById(id);
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void delUser(int id) {
        userRepo.deleteUserById(id);
    }
}
