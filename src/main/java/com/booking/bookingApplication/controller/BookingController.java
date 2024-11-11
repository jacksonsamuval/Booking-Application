package com.booking.bookingApplication.controller;

import com.booking.bookingApplication.entity.BookingDetails;
import com.booking.bookingApplication.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/booking/")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public BookingDetails bookRooms(@RequestParam Integer userId, @RequestParam Integer hotelId, @RequestBody BookingDetails bookingDetails)
    {
        return bookingService.bookRoom(userId,hotelId,bookingDetails);
    }

    @GetMapping("/allBooking")
    public List<BookingDetails> allBookings()
    {
        return bookingService.listAllBooking();
    }

    @GetMapping("/getById/{id}")
    public Optional<BookingDetails> getBookingById(@PathVariable Integer id)
    {
        return bookingService.findBookingById(id);
    }
}
