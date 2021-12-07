package com.techelevator.dao;

import com.techelevator.model.Auction;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public interface AuctionDao {

    List<Auction> getAllAuctions();

 void createAuction(Auction auction);

    void updateAuction(Auction auction);
}
