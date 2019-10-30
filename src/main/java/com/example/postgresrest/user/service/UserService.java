package com.example.postgresrest.user.service;

import com.example.postgresrest.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUser();
    Optional<User> findUserById(Integer idUser);
    User saveUsers(User user);
    User updateUsers(User user);
    void deleteUser(User user);
}
