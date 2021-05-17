package com.wad.fils.wadtrojan.repositories;

import com.wad.fils.wadtrojan.domain.Museum;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Museum,Long> {
    List<Museum> findAll();

}
