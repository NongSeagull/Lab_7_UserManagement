package com.mycompany.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class UserService {

    private static ArrayList<User> userList = new ArrayList<>();
    private static int lastID = 1;

    static {
        User admin = new User(1, "admin", "Administrator", "pass@1234", 'M', 'A');
        User user1 = new User(2, "user1", "User 1", "pass@1234", 'F', 'U');
        User user2 = new User(3, "user2", "User 2", "pass@1234", 'M', 'U');

        addUser(admin);
        addUser(user1);
        addUser(user2);
    }

    public static User addUser(User newUser) {
        newUser.setID(lastID++);
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
        userList.set(index, user);
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
