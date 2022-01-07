package com.shyam.ticketapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@RedisHash("Venue")
public class Venue {

    @Id
    private String Id;
    private String name;
    @Indexed
    private String city;
    private Double lat;
    private Double lon;


}
