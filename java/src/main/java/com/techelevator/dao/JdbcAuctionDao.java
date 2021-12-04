package com.techelevator.dao;

import com.techelevator.model.Auction;

import java.util.List;

public class JdbcAuctionDao implements AuctionDao{
    @Override
    public List<Auction> getAllAuctions() {
        return null;
    }

    @Override
    public Auction getAuctionById(int auctionId) {
        return null;
    }

    @Override
    public boolean createAuction(Auction auction) {
        return false;
    }

    @Override
    public boolean updateAuction(Auction auction) {
        return false;
    }
}
