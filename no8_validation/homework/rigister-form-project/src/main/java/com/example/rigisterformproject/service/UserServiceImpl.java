package com.example.rigisterformproject.service;

import com.example.rigisterformproject.model.User;
import com.example.rigisterformproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addNewUser(User user) {

        userRepository.save(user);
    }

    @Override
    public void removeUser(Long id) {
        User existedUser = userRepository.findById(id).orElse(null);

        if (existedUser != null) {
            userRepository.deleteById(id);
        }
    }

    @Override
    public void updateUser(Long id, User user) {
        User existedUser = userRepository.findById(id).orElse(null);

        if (existedUser != null) {
            existedUser.setFirstName(user.getFirstName());
            existedUser.setLastName(user.getLastName());
            existedUser.setPhoneNumber(user.getPhoneNumber());
            existedUser.setEmail(user.getEmail());
            existedUser.setAge(user.getAge());

            userRepository.save(existedUser);
        }
    }
}
