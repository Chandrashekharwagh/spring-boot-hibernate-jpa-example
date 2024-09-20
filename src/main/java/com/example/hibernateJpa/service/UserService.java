package com.example.hibernateJpa.service;

import com.example.hibernateJpa.model.User;
import com.example.hibernateJpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        logger.info("Users Retrieved");
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        logger.info("User detected by ID");
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        logger.info("User Created");
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            logger.info("User Updated");
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        logger.info("User deleted");
        userRepository.deleteById(id);
    }
}
