package com.shyam.ticketapp.repository;

import com.shyam.ticketapp.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingDao extends CrudRepository<Booking,String> {
}
