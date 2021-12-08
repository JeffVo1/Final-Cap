package com.techelevator.dao;

import com.techelevator.model.Item;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
=======
import java.security.Principal;
import java.util.List;

>>>>>>> main
@Component
public interface ItemDao {


    void createItem(Item item);

    void updateItem(Item item);

    Item getItemByItemId(int itemId);

    Item getItemByAuctionId(int auctionId);

    List<Item> listAllAvailableItems();

    List<Item> listAllUserItems(Principal principal);

    void deleteItemById(Item item);


}
