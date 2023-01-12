package com.example.myProd.DAO;

import com.example.myProd.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> showAllUsers();
    public User showUserInfo(int id);
    public void addUser(User user);
    public void delUser(int id);
}
