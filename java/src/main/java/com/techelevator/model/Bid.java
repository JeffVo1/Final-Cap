package com.techelevator.model;

public class Bid {


    public float bidId;
    public int itemId;
    public int userId;
    public int amount;

    public float getBidId() {
        return bidId;
    }

    public void setBidId(float bidId) {
        this.bidId = bidId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
