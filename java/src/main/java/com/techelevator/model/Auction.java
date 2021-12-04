package com.techelevator.model;

import java.sql.Timestamp;
import java.util.Date;

public class Auction {
    private float auctionId;
    private int charityId;
    private int startBid;
    private Timestamp startTime;
    private String status;


    public float getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(float auctionId) {
        this.auctionId = auctionId;
    }

    public int getCharityId() {
        return charityId;
    }

    public void setCharityId(int charityId) {
        this.charityId = charityId;
    }

    public int getStartBid() {
        return startBid;
    }

    public void setStartBid(int startBid) {
        this.startBid = startBid;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
