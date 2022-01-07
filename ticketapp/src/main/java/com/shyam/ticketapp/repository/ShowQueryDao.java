package com.shyam.ticketapp.repository;


import com.shyam.ticketapp.entity.Show;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ShowQueryDao extends QueryByExampleExecutor<Show> {
}

