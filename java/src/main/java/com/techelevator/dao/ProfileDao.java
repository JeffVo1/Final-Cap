package com.techelevator.dao;

import com.techelevator.model.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public interface ProfileDao {

    void createNewProfile(Profile profile);


}
