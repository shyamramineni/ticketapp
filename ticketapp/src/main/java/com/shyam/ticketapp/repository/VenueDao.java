package com.shyam.ticketapp.repository;

import com.shyam.ticketapp.entity.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueDao extends CrudRepository<Venue, String> {

}
