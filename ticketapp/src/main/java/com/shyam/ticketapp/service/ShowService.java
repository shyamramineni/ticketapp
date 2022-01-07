package com.shyam.ticketapp.service;

import com.shyam.ticketapp.entity.Movie;
import com.shyam.ticketapp.entity.Show;
import com.shyam.ticketapp.entity.Venue;
import com.shyam.ticketapp.repository.ShowQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.List;



public class ShowService {
    @Autowired
    ShowQueryDao showQueryDao;

    public List<Show> queryShows(String movieName, String city) {

        Show show = new Show();
        Movie movie = Movie.builder().name(movieName).build();
        Venue venue = Venue.builder().city(city).build();
        show.setMovie(movie);
        show.setVenue(venue);

        /*ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("lastname")
                .withIncludeNullValues()
                .withStringMatcher(StringMatcher.ENDING);*/

        return (List<Show>) showQueryDao.findAll(Example.of(show));

    }
}
