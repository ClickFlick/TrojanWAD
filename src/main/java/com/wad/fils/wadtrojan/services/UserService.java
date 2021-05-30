package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.User;

import java.util.List;

public interface UserService {
    boolean save(User user);
    boolean loginCheck(User user);
    User findById(Long id);
    void saveUpdate(User user);

    List<User> showAll();
}
