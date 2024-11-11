package com.booking.bookingApplication.repo;

import com.booking.bookingApplication.entity.HotelDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<HotelDetails,Integer> {
}
