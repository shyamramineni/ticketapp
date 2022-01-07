package com.shyam.ticketapp.repository;

import com.shyam.ticketapp.entity.Movie;
import org.springframework.data.repository.CrudRepository;


public interface MovieDao extends CrudRepository<Movie, String> {


}
