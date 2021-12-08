package com.techelevator.dao;

import com.techelevator.model.Auction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class JdbcAuctionDao implements AuctionDao{


    private JdbcTemplate jdbcTemplate;

    public JdbcAuctionDao( JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Auction> getAllAuctions() {
        String sql = "";
        return null;
    }



    @Override
    public void createAuction(Auction auction) {
        String sql = "INSERT INTO auction (charity_id, start_time, status, end_time) " +
                "VALUES (?, ?,?,?);";
        jdbcTemplate.update(sql, auction.getCharityId(),auction.getStartTime(),auction.getStatus(), auction.getEndTime());


    }

    @Override
    public void updateAuction(Auction auction) {

    }
}
