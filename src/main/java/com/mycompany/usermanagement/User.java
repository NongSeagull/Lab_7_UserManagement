package com.mycompany.usermanagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class User implements Serializable {

    private int id;
    private String username;
    private String name;
    private String password;
    private char gender;
    private char role;

    public User() {
        this.id = 0;
        this.username = null;
        this.name = null;
        this.password = null;
        this.gender = '-';
        this.role = '-';
    }

    public User(int id, String login, String name, String password, char gender, char role) {
        this.id = id;
        this.username = login;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.role = role;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setLogin(String login) {
        this.username = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User {[ id : " + id + " ]  -->"
                + "  username : " + username
                + ",  name : " + name
                + ",  password : " + password
                + ",  gender : " + gender
                + ",  role : " + role + " }";
    }
}
