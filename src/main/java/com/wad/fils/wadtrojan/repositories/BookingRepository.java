package com.wad.fils.wadtrojan.repositories;

import com.wad.fils.wadtrojan.domain.BookMuseum;
import com.wad.fils.wadtrojan.domain.Museum;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookMuseum,Long> {
}
