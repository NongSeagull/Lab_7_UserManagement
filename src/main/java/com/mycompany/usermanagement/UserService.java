package com.mycompany.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class UserService {

    private static ArrayList<User> userList = new ArrayList<>();
    private static int lastID = 1;

    public UserService() {
    }

    public static User addUser(User newUser) {
        newUser.setID(lastID += 1);
        userList.add(newUser);
        return newUser;
    }

    public static ArrayList<User> getUsers() {
        return UserService.userList;
    }

    public static User getUser(int index) {
        return UserService.userList.get(index);
    }

    public static User getUserByID(int id) {
        for (User user : userList) {
            if (user.getID() == id) {
                return user;
            }
        }
        return null;
    }

    public static int getSize() {
        return userList.size();
    }

    public static User updateUser(int index, User user) {
        UserService.userList.set(index, user);
        return user;
    }

    public static User deleteUser(int index) {
        return userList.remove(index);
    }

    public static void printList() {
        ArrayList<User> list = UserService.getUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
