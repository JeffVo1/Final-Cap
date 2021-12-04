package com.techelevator.dao;

import com.techelevator.model.Bid;

import java.security.Principal;
import java.util.List;

public interface BidDao {
    Bid getBidByUserId(int userId);

    List<Bid> getAllUsersBids(Principal principal);

    Bid getBidByAuctionId(int auctionId);

    List<Bid> getAllBidsForAuctionId(int auctionId);

    boolean createBid(Bid bid);

}
