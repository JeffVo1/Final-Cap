package com.techelevator.controller;

import com.techelevator.dao.AuctionDao;
import com.techelevator.model.Auction;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController(AuctionDao auctionDao){
        this.auctionDao= auctionDao;
    }

    @RequestMapping(path = "/auction", method = RequestMethod.POST)
    public void createAuction(@RequestBody Auction auction){
        auctionDao.createAuction(auction);
    }


}
