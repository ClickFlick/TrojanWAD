package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.User;

public interface UserService {
    boolean save(User user);
    boolean loginCheck(User user);
}
