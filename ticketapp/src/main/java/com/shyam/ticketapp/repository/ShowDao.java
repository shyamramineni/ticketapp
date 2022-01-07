package com.shyam.ticketapp.repository;

import com.shyam.ticketapp.entity.Movie;
import com.shyam.ticketapp.entity.Show;
import com.shyam.ticketapp.entity.Venue;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowDao extends CrudRepository<Show, String> {





}
