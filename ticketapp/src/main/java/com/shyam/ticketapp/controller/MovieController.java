package com.shyam.ticketapp.controller;


import com.shyam.ticketapp.entity.Movie;
import com.shyam.ticketapp.repository.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @PostMapping
    public Movie save(@RequestBody Movie movie){
        return movieDao.save(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        movieDao.findAll().forEach(movies::add);
        return movies;
    }
    @GetMapping("/{id}")
    public Movie findMovie(@PathVariable String id){
        return movieDao.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable String id){
        movieDao.deleteById(id);
        return "Movie Deleted";
    }



}
