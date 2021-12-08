package com.techelevator.dao;

import com.techelevator.model.Bid;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.List;
@Component
public class JdbcBidDao implements BidDao{
    @Override
    public Bid getBidByUserId(int userId) {
        return null;
    }

    @Override
    public List<Bid> getAllUsersBids(Principal principal) {
        return null;
    }

    @Override
    public Bid getBidByAuctionId(int auctionId) {
        return null;
    }

    @Override
    public List<Bid> getAllBidsForAuctionId(int auctionId) {
        return null;
    }

    @Override
    public boolean createBid(Bid bid) {
        return false;
    }
}
