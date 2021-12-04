package com.techelevator.dao;

import com.techelevator.model.Item;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcItemDao implements ItemDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcItemDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createItem(Item item) {
        String sql = "INSERT INTO item (auction_id, item_name, description, user_id, price) " +
                "VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, item.getAuctionId(), item.getItemName(), item.getDescription(), item.getUserId(), item.getPrice());

    }

    @Override
    public void updateItem(Item item) {
       String sql = "UPDATE item " +
                "SET item_id = ?, auction_id = ?, item_name = ?, description = ?, user_id = ?, price = ? " +
                "WHERE item_id = ?;";
       jdbcTemplate.update(sql,item.getItemId(),item.getAuctionId(), item.getItemName(), item.getDescription(),item.getUserId(),item.getPrice(),item.getItemId());
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

    private Item mapRowToItem(SqlRowSet result){
        Item item = new Item();
        item.setUserId(result.getInt("user_id"));
        item.setAuctionId(result.getInt("auction_id"));
        item.setDescription(result.getString("description"));
        item.setItemId(result.getFloat("item_id"));
        item.setPrice(result.getInt("price"));
        item.setItemName(result.getString("item_name"));

        return item;
    }
}
