package com.shyam.ticketapp.repository;

import com.shyam.ticketapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
