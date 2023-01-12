package com.example.myProd.service;

import com.example.myProd.DAO.UserDAO;
import com.example.myProd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDAO dao;

    @Override
    public List<User> showAllUsers() {
        return dao.showAllUsers();
    }

    @Override
    public User showUserInfo(int id) {
        return dao.showUserInfo(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    @Transactional
    public void delUser(int id) {
        dao.delUser(id);
    }
}
