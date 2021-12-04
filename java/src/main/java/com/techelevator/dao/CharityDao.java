package com.techelevator.dao;

import org.springframework.stereotype.Component;
import com.techelevator.model.Charity;

@Component

public interface CharityDao {

    void createCharity(Charity charity);

    void updateCharity(Charity charity);

    Charity getCharityByName(String charityName);
}
