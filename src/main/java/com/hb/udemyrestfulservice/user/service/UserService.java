package com.hb.udemyrestfulservice.user.service;

import com.hb.udemyrestfulservice.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> userList = new ArrayList<>();
    private static int currentUserCount;

    static {
        userList.add(new User(1,"Saul Goode", "2-12-1989"));
        userList.add(new User(2,"Kodo Kata", "23-1-1988"));
        userList.add(new User(3,"Mat Cool", "17-9-1999"));
        currentUserCount = 3;
    }

    public List<User> findAll() {
        return userList;
    }

    public User save(User userToSave) {

        if (userToSave.getUserId() == 0) {
           userToSave.setUserId(++currentUserCount);
            userList.add(userToSave);

        } else {
            User existingUser = findUserById(userToSave.getUserId());
            existingUser.setFullName(userToSave.getFullName());
            existingUser.setDateOfBirth(userToSave.getDateOfBirth());

            userToSave = existingUser;
        }

        return userToSave;
    }

    public User findUserById(int userId) {
        return userList.stream()
                .filter(user -> user.getUserId() == userId)
                .findAny()
                .orElse(null);
    }
}
