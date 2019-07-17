package com.example.LedLuqi.user;

import com.example.LedLuqi.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser (User user){
        userRepository.save(user);
    }

    public void deleteUser (User user){
        userRepository.delete(user);
    }

    public void editUser (User user){
        userRepository.save(user);
    }
}
