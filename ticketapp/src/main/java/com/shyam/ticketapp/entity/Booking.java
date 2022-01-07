package com.shyam.ticketapp.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("Booking")
public class Booking {
    @Id
    private String id;
    @Reference
    private Show show;
    @Reference
    private User user;
    private int seats;
    private double cost;
    private double discount;

}
