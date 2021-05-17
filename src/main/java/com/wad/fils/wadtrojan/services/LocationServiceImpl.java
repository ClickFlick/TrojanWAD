package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.Museum;
import com.wad.fils.wadtrojan.repositories.LocationRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Museum findById(Long id) {
        Optional<Museum> optionalMuseum = locationRepository.findById(id);

        if (optionalMuseum.isEmpty()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return optionalMuseum.get();
    }
}
