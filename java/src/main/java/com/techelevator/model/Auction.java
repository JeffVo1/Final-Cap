package com.techelevator.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Auction {
    private float auctionId;
    private int charityId;
    private Timestamp startTime;
    private String status = "active";
    private Timestamp endTime;


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

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
