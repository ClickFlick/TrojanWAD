package com.wad.fils.wadtrojan.repositories;

import com.wad.fils.wadtrojan.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String userName);
}
