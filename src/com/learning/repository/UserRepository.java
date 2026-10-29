package com.learning.repository;

import com.learning.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<User> findAll() {
        return users;
    }

    public boolean deleteById(String id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
