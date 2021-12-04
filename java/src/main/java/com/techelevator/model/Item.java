package com.techelevator.model;

public class Item {

    public float itemId;
    public int auctionId;
    public String itemName;
    public String description;
    public int userId;
    public int price;

    public float getItemId() {
        return itemId;
    }

    public void setItemId(float itemId) {
        this.itemId = itemId;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
