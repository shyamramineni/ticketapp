package com.shyam.ticketapp.controller;


import com.shyam.ticketapp.entity.Booking;
import com.shyam.ticketapp.repository.BookingDao;
import com.shyam.ticketapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingDao bookingDao;

    @Autowired
    private BookingService bookingService;

    public BookingController() {
    }

    @PostMapping
    public Booking save(@RequestBody Booking booking) {
        //Booking booking1 = bookingService
        return bookingDao.save(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        bookingDao.findAll().forEach(bookings::add);
        return bookings;
    }
    @GetMapping("/{id}")
    public Booking findBooking(@PathVariable String id){
        return bookingDao.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable String id){
        bookingDao.deleteById(id);
        return "Booking Deleted";
    }



}
