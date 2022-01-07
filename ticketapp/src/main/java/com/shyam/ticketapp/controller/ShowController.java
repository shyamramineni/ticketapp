package com.shyam.ticketapp.controller;


import com.shyam.ticketapp.entity.Show;
import com.shyam.ticketapp.repository.ShowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private ShowDao showDao;

    @PostMapping
    public Show save(@RequestBody Show show){
        return showDao.save(show);
    }

    @GetMapping
    public List<Show> getAllShows() {
        List<Show> shows = new ArrayList<>();
        showDao.findAll().forEach(shows::add);
        return shows;
    }
    @GetMapping("/{id}")
    public Show findShow(@PathVariable String id){
        return showDao.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteShow(@PathVariable String id){
        showDao.deleteById(id);
        return "Show Deleted";
    }



}
