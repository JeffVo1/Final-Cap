package com.techelevator.dao;

import com.techelevator.model.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcProfileDao implements ProfileDao{


    private JdbcTemplate jdbctemplate;

    public JdbcProfileDao(JdbcTemplate jdbcTemplate){
        this.jdbctemplate = jdbcTemplate;
    }


    @Override
    public void createNewProfile(Profile profile) {
        String sql = "INSERT INTO profile ( user_id, first_name, last_name, address_id, phone_number, contact_times)\n" +
                "VALUES (?, ?, ?, ?, ?, ?);";
        jdbctemplate.update(sql, profile.getUserId(), profile.getFirstName(), profile.getLastName(),
                profile.getAddress().getAddressId(), profile.getPhoneNumber(), profile.getContactTimes());
    }
}
