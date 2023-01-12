package com.example.myProd.service;

import com.example.myProd.model.User;

import java.util.List;

public interface UserService {
    public List<User> showAllUsers();
    public User showUserInfo(int id);
    public void addUser(User user);
    public void delUser(int id);
}
