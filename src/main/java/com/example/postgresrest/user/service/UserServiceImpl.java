package com.example.postgresrest.user.service;

import com.example.postgresrest.user.model.User;
import com.example.postgresrest.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Integer idUser) {
        return userRepository.findById(idUser);
    }

    @Override
    public User saveUsers(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUsers(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
