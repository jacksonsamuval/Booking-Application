package com.booking.bookingApplication.service;

import com.booking.bookingApplication.entity.HotelDetails;
import com.booking.bookingApplication.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    public String saveHotel(HotelDetails hotelDetails) {
        if(hotelDetails!=null)
        {
            hotelRepo.save(hotelDetails);
            return "Success";
        }
        return "Failure";
    }

    public List<HotelDetails> getAllHotels() {
        return hotelRepo.findAll();
    }
}
