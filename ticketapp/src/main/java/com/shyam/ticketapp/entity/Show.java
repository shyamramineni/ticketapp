package com.shyam.ticketapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("Show")
public class Show {

    @Id
    private String id;
    private Date showtime;
    @Reference
    private Movie movie;
    @Reference
    private Venue venue;
    private int seatsTotal;
    private int seatsTaken;
    private double price;

}
