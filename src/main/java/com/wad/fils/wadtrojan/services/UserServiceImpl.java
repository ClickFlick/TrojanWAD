package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.domain.User;
import com.wad.fils.wadtrojan.repositories.UserRepository;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean save(User user) {
        PasswordEncoder bcrypt = new BCryptPasswordEncoder();
        user.setPassword(bcrypt.encode(user.getPassword()));
        String username = userRepository.findByUsername(user.getUsername()).toString();
        if (username.equals(user.getUsername())){
            userRepository.save(user);
            return true;
        }else {
            System.out.println("User exists");
            return false;
        }

    }

    @Override
    public boolean loginCheck(User user) {
        return false;
    }

    @Override
    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isEmpty()) {
            throw new RuntimeException("Location not found!");
        }

        return optionalUser.get();
    }
}
