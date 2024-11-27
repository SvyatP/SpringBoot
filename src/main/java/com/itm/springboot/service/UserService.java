package com.itm.springboot.service;

import com.itm.springboot.model.User;
import com.itm.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void createOrUpdateUser(User user) {
        userRepository.save(user);
    }

    public User readUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User deleteUser(long id) {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(userRepository::delete);
        return user.orElse(null);
    }
}
