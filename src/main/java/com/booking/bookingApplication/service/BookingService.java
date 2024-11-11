package com.booking.bookingApplication.service;

import com.booking.bookingApplication.entity.BookingDetails;
import com.booking.bookingApplication.entity.HotelDetails;
import com.booking.bookingApplication.entity.Users;
import com.booking.bookingApplication.repo.BookingRepo;
import com.booking.bookingApplication.repo.HotelRepo;
import com.booking.bookingApplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private HotelRepo hotelRepo;
    public List<BookingDetails> listAllBooking() {
        return bookingRepo.findAll();
    }

    public Optional<BookingDetails> findBookingById(Integer id) {
        return bookingRepo.findById(id);
    }

    public BookingDetails bookRoom(Integer userId, Integer hotelId, BookingDetails bookingDetails) {
        Users user = userRepo.findById(userId).orElseThrow(()->
                new RuntimeException("User Not Found")
                );

        HotelDetails hotel = hotelRepo.findById(hotelId).orElseThrow(()->
                new RuntimeException("Hotel Not Found")
                );

        bookingDetails.setUsers(user);
        bookingDetails.setHotelDetails(hotel);

        return bookingRepo.save(bookingDetails);
    }
}
