package com.techelevator.controller;

import com.techelevator.dao.ItemDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Item;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class ItemController {

    private ItemDao itemDao;
    private UserDao userDao;

    public ItemController(ItemDao itemDao, UserDao userDao){
        this.itemDao = itemDao;
        this.userDao = userDao;
    }

    @RequestMapping(path = "/item/a{id}", method = RequestMethod.GET)
    public Item getItemByAuctionId(@PathVariable int auctionId){
        return itemDao.getItemByAuctionId(auctionId);
    }

    @RequestMapping(path = "/item/{id}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable int itemId){
        return itemDao.getItemByAuctionId(itemId);
    }

    @RequestMapping(path = "/item/update/{id}", method = RequestMethod.PUT)
    public void updateItemById(@RequestBody Item item){
        itemDao.updateItem(item);
    }
    @RequestMapping(path = "/item", method = RequestMethod.POST)
    public void createItem(@RequestBody Item item){
        itemDao.createItem(item);
    }
    @RequestMapping(path = "/allitems", method = RequestMethod.GET)
    public List<Item> getListOfAllItems() {
        return itemDao.listAllAvailableItems();
    }
    @RequestMapping(path = "/useritems", method = RequestMethod.GET)
    public List<Item> getAllUserItems(Principal principal) {
        return itemDao.listAllUserItems(principal);
    }
    @RequestMapping (path = "/deleteitem", method = RequestMethod.DELETE)
    public void deleteItemByID(Item item){
        itemDao.deleteItemById(item);
    }



}
