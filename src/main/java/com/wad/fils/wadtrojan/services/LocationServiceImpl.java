package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.repositories.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }


    @Override
    public List<Museum> findAll() {
        return locationRepository.findAll();
    }
}
