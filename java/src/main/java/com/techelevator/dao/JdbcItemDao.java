package com.techelevator.dao;

import com.techelevator.model.Item;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcItemDao implements ItemDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcItemDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createItem(Item item) {
        String sql = "INSERT INTO item (auction_id, item_name, description, user_id) " +
                "VALUES (?, ?, ?, ?);";
        jdbcTemplate.update(sql, item.getAuctionId(), item.getItemName(), item.getDescription(), item.getUserId());

    }

    @Override
    public void updateItem(Item item) {
       String sql = "UPDATE item " +
                "SET item_id = ?, auction_id = ?, item_name = ?, description = ?, user_id = ?" +
                "WHERE item_id = ?;";
       jdbcTemplate.update(sql,item.getItemId(),item.getAuctionId(), item.getItemName(), item.getDescription(),item.getUserId(),item.getItemId());
    }

    @Override
    public Item getItemByItemId(int itemId) {
        Item item = null;
        String sql ="SELECT item_id, auction_id, item_name, description, user_id, price " +
                "FROM item " +
                "WHERE item_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, itemId);
        if (results.next()){
            item = mapRowToItem(results);
        }

        return item;
    }

    @Override
    public Item getItemByAuctionId(int auctionId) {
        Item item = null;
        String sql ="SELECT item_id, auction_id, item_name, description, user_id, price " +
                "FROM item " +
                "WHERE auction_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, auctionId);
        if (results.next()){
            item = mapRowToItem(results);
        }
        return item;
    }

    @Override
    public List<Item> listAllAvailableItems() {
        List<Item> itemList = new ArrayList<>();
        String sql = "Select item_id, item.auction_id, item_name, description, user_id " +
                "FROM item " +
                "JOIN auction " +
                "ON item.auction_id = auction.auction_id " +
                "WHERE auction.status = 'active';";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while (result.next()){
            itemList.add(mapRowToItem(result));
        }
        return itemList;
    }
    public List<Item> listAllUserItems(Principal principal){
        List<Item> itemList = new ArrayList<>();
        String sql = "Select item_id, item.auction_id, item_name, description, user_id " +
                "FROM item " +
                "Where user_id =?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
        while (result.next()){
            itemList.add(mapRowToItem(result));
        }
        return itemList;
    }

    public void deleteItemById(Item item){
        String sql = "DELETE FROM item " +
                "WHERE item_id = ?;";
        jdbcTemplate.update(sql);
    }

    private Item mapRowToItem(SqlRowSet result){
        Item item = new Item();
        item.setUserId(result.getInt("user_id"));
        item.setAuctionId(result.getInt("auction_id"));
        item.setDescription(result.getString("description"));
        item.setItemId(result.getFloat("item_id"));
        item.setItemName(result.getString("item_name"));

        return item;
    }
}
