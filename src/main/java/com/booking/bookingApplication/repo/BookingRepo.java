package com.booking.bookingApplication.repo;

import com.booking.bookingApplication.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<BookingDetails,Integer> {
}
