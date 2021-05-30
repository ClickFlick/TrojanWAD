package com.wad.fils.wadtrojan.services;

import com.wad.fils.wadtrojan.domain.BookMuseum;
import com.wad.fils.wadtrojan.repositories.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public void Save(BookMuseum museum) {
        bookingRepository.save(museum);
    }
}
