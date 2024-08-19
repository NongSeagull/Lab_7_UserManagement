/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class UserService {

    ArrayList<User> userList = new ArrayList<>();
    int lastID = 1;

    public UserService() {
    }

    public User addUser(User newUser) {
        this.userList.add(newUser);
        return newUser;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public User getUser(int index) {
        return this.userList.get(index);
    }

    public User getUserByID(int id) {
        return this.userList.get(id);
    }

    public int getSize() {
        return 0;
    }

    public User updateUser(int index, User user) {
        this.userList.add(index, user);
        return null;
    }

    public User deleteUser(int index) {
        return null;
    }
}
