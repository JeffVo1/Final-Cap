package com.techelevator.dao;

import com.techelevator.model.Charity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class JdbcCharityDao implements CharityDao{

   private JdbcTemplate jdbcTemplate;

   public JdbcCharityDao(JdbcTemplate jdbcTemplate) {
       this.jdbcTemplate = jdbcTemplate;
   }


    @Override
    public void createCharity(Charity charity) {
       String sql = "INSERT INTO charity (charity_name) " +
               "VALUES (?);";
       jdbcTemplate.update(sql, charity.getCharityName());
    }

    @Override
    public void updateCharity(Charity charity) {
       String sql = "UPDATE charity " +
               "SET charity_id = ?, charity_name = ? " +
               "WHERE charity_id = ?";
       jdbcTemplate.update(sql, charity.getCharityId(), charity.getCharityName(), charity.getCharityId());
    }


    @Override
    public Charity getCharityByName(String charityName) {
        String sql = "SELECT charity_name, charity_id " +
                "FROM charity " +
                "WHERE charity_name = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, charityName);
        if (results.next()) {
            Charity charity = new Charity();
            charity.setCharityName(results.getString("charity_name"));
            charity.setCharityId(results.getFloat("charity_id"));
            return charity;
        }
        return null;
    }
    public List<Charity> getAllCharityWithActiveAuction(){
       List<Charity> charityList = new ArrayList<>();
       String sql = "SELECT charity_name, charity.charity_id " +
               "FROM charity " +
               "JOIN auction " +
               "on charity.charity_id = auction.charity_id " +
               "WHERE auction.status = 'active';";
       SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
       while (result.next()){
           charityList.add(mapRowToCharity(result));
       }
       return charityList;

    }

    public Charity mapRowToCharity(SqlRowSet results){
        Charity charity = new Charity();
        charity.setCharityName(results.getString("charity_name"));
        charity.setCharityId(results.getFloat("charity_id"));
        return charity;
    }

}
