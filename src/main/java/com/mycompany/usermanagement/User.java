package com.mycompany.usermanagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class User implements Serializable {

    private int id;
    private String login;
    private String name;
    private String password;
    private char gender;
    private char role;

    public User() {
        this.id = 0;
        this.login = null;
        this.name = null;
        this.password = null;
        this.gender = '-';
        this.role = '-';
    }

    public User(int id, String login, String name, String password, char gender, char role) {
        this.id = id;
        this.login = login;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
                + "  username : " + login
                + ",  name : " + name
                + ",  password : " + password
                + ",  gender : " + gender
                + ",  role : " + role + " }";
    }
}
