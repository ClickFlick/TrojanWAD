package com.wad.fils.wadtrojan.security;

import com.wad.fils.wadtrojan.domain.User;
import com.wad.fils.wadtrojan.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRepoUserDetails implements UserDetailsService {

    private final UserRepository userRepository;

    public UserRepoUserDetails(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user != null) {
            return user;
        }else{
            throw new UsernameNotFoundException("User " + s +" not found ");
        }
    }
}
