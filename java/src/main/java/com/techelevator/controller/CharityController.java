package com.techelevator.controller;

import com.techelevator.dao.CharityDao;
import com.techelevator.model.Charity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharityController {

    private CharityDao charityDao;

    public CharityController(CharityDao charityDao) {
        this.charityDao = charityDao;
    }
    @RequestMapping(path = "/charity/{charityName}", method = RequestMethod.GET)

    public Charity getCharity(@PathVariable String charityName) {
        return charityDao.getCharityByName(charityName);
    }
    @RequestMapping(path = "/charity/update", method = RequestMethod.PUT)

    public void updateCharity(@RequestBody Charity charityName) {
        charityDao.updateCharity(charityName);
    }

    @RequestMapping(path = "/charity", method = RequestMethod.POST)
    public void createCharity(@RequestBody Charity charityName) {
        charityDao.createCharity(charityName);
    }

    @RequestMapping(path = "/currentcharitys", method = RequestMethod.GET)
    public List<Charity> listAllActiveCharities(){
       return charityDao.getAllCharityWithActiveAuction();
    }

}
