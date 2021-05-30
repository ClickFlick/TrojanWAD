package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.Museum;

import java.util.List;

public interface LocationService {
    List<Museum> findAll();
    Museum findById(Long id);
    void save(Museum museum);
}
