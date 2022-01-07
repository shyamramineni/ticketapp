package com.shyam.ticketapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("User")
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String location;
    private boolean isConsumer;
    private boolean isBusiness;


}
