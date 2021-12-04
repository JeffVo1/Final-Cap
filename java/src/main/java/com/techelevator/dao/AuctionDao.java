package com.techelevator.dao;

import com.techelevator.model.Auction;

import java.util.List;

public interface AuctionDao {

    List<Auction> getAllAuctions();

    Auction getAuctionById(int auctionId);

    boolean createAuction(Auction auction);

    boolean updateAuction(Auction auction);
}
