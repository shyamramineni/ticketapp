package com.shyam.ticketapp.controller;


import com.shyam.ticketapp.entity.Venue;
import com.shyam.ticketapp.repository.VenueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Venue")
public class VenueController {

    @Autowired
    private VenueDao venueDao;

    @PostMapping
    public Venue save(@RequestBody Venue venue){
        return venueDao.save(venue);
    }

    @GetMapping
    public List<Venue> getAllVenues() {
        List<Venue> venues = new ArrayList<>();
        venueDao.findAll().forEach(venues::add);
        return venues;
    }
    @GetMapping("/{id}")
    public Venue findVenue(@PathVariable String id){
        return venueDao.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteVenue(@PathVariable String id){
        venueDao.deleteById(id);
        return "Venue Deleted";
    }



}
