package com.shyam.ticketapp;

import com.shyam.ticketapp.entity.*;
import com.shyam.ticketapp.repository.MovieDao;
import com.shyam.ticketapp.repository.ShowDao;
import com.shyam.ticketapp.repository.UserDao;
import com.shyam.ticketapp.repository.VenueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataBuildRunner implements CommandLineRunner {

    @Autowired
    private VenueDao venueDao;
    @Autowired
    private MovieDao movieDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ShowDao showDao;

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("Creating Venues");
        venueDao.save(Venue.builder().name("GPR").city("Hyderabad").lat(Double.valueOf(54.56)).lon(Double.valueOf(54.56)).build());
        venueDao.save(Venue.builder().name("INOX").city("Hyderabad").lat(Double.valueOf(54.56)).lon(Double.valueOf(54.56)).build());
        venueDao.save(Venue.builder().name("PVR").city("Hyderabad").lat(Double.valueOf(54.56)).lon(Double.valueOf(54.56)).build());
        System.out.println("Created Venues");

        System.out.println("Creating Movies");
        movieDao.save(Venue.builder().name("GPR").city("Hyderabad").lat(Double.valueOf(54.56)).lon(Double.valueOf(54.56)).build());
        movieDao.save(Movie.builder().name("JATHIRATNALU").lang("Telugu").genre("Comedy").build());
        movieDao.save(Movie.builder().name("PUSHPA").lang("Telugu").genre("Action").build());
        System.out.println("Created Movies");

        System.out.println("Creating Users");
        userDao.save(User.builder().firstName("Shyam").lastName("Ramineni").email("sh@gmail.com").location("Hyderabad").build());
        System.out.println("Created User");

        Venue venue1 = venueDao.findAll().iterator().next();
        Movie movie1 = movieDao.findAll().iterator().next();
        User user1 = userDao.findAll().iterator().next();

        System.out.println("Creating a Show");
        Show show1 = Show.builder().showtime(new Date()).seatsTotal(100).seatsTaken(0).build();
        show1.setMovie(movie1);
        show1.setVenue(venue1);
        showDao.save(show1);
        System.out.println("Created Show");

        Show show2 = showDao.findAll().iterator().next();

        System.out.println("Creating Booking");
        Booking booking1 = Booking.builder().seats(2).build();
        booking1.setUser(user1);
        booking1.setShow(show1);
        System.out.println("Creating a booking");*/



    }
}
