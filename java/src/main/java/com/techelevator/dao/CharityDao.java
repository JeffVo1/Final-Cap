package com.techelevator.dao;

import com.techelevator.model.Charity;

public interface CharityDao {

    boolean createCharity(Charity charity);

    boolean updateCharity(Charity charity);

    Charity getCharityByName(String charityName);
}
