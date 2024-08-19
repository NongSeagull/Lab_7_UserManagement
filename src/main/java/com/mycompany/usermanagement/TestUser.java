package com.mycompany.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author 65160230 Piyapong
 */
public class TestUser {

    public static void main(String[] args) {
        User admin = new User(1, "admin", "Administrator", "pass@1234", 'M', 'A');
        User user1 = new User(2, "user1", "User 1", "pass@1234", 'F', 'U');
        User user2 = new User(3, "user2", "User 2", "pass@1234", 'M', 'U');

        ArrayList<User> userList = new ArrayList<>(); //Generic type
        userList.add(admin);
        userList.add(user1);
        userList.add(user2);

        int i;
        System.out.println("--- Print all user ---");
        for (i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
            System.out.println("--------------------------");
        }
        System.out.println("--- print remove userList at index 0 (admin info are gone) ---");
        userList.remove(0);
        for (i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
            System.out.println("--------------------------");
        }
        System.out.println("--- print set userList at index 0 to admin ---");
        userList.set(0, admin);
        for (i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
            System.out.println("--------------------------");
        }

        System.out.println("--- print UserService ---");
        UserService.addUser(admin);
        UserService.addUser(user1);
        UserService.addUser(user2);
        UserService.printList();
        
        System.out.println("--- print get user by ID ---");
        System.out.println(UserService.getUserByID(3));
        
        System.out.println("--- print delete user by ID ---");
        UserService.deleteUser(1);
        UserService.printList();
    }
}
