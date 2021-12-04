package com.techelevator.dao;

import com.techelevator.model.Charity;

public class JdbcCharityDao implements CharityDao{
    @Override
    public boolean createCharity(Charity charity) {
        return false;
    }

    @Override
    public boolean updateCharity(Charity charity) {
        return false;
    }

    @Override
    public Charity getCharityByName(String charityName) {
        return null;
    }
}
