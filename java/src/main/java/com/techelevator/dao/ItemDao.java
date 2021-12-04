package com.techelevator.dao;

import com.techelevator.model.Item;

public interface ItemDao {


    void createItem(Item item);

    void updateItem(Item item);

    Item getItemByItemId(int itemId);

    Item getItemByAuctionId(int auctionId);

}
