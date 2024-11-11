package com.booking.bookingApplication.controller;

import com.booking.bookingApplication.entity.HotelDetails;
import com.booking.bookingApplication.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hotels/")
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @PostMapping("/saveHotel")
    public String saveHotel(@RequestBody HotelDetails hotelDetails)
    {
        return hotelService.saveHotel(hotelDetails);
    }

    @GetMapping("/allHotels")
    public List<HotelDetails> getAllHotel()
    {
        return hotelService.getAllHotels();
    }
}
