package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("tom", "123", "Tom", "tom@gmail.com", 18));
        users.add(new User("peter", "123", "Petar", "peter@gmail.com", 18));
        users.add(new User("natasha", "123", "Natasha", "natasha@gmail.com", 18));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
