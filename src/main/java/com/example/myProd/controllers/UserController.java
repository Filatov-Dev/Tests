package com.example.myProd.controllers;

import com.example.myProd.DAO.UserDAO;
import com.example.myProd.Exeptions.UserNotFoundException;
import com.example.myProd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping()
    public List<User> getAllUsers(){
        return  userDAO.showAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userDAO.showUserInfo(id);
    }

    @PostMapping("/add")
    public void addNewUser(@RequestBody User user){
        userDAO.addUser(user);
    }

    @DeleteMapping("/del/{id}")
    public List<User> delUser (@PathVariable("id") int id) {
        if(userDAO.showUserInfo(id)==null){
            throw new UserNotFoundException("User with id=" + id + " not found.");
        } else { userDAO.delUser(id);}
        return getAllUsers();
    }
}
