package com.techelevator.controller;

import com.techelevator.dao.ProfileDao;
import com.techelevator.model.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private ProfileDao profileDao;

    public ProfileController(ProfileDao profileDao){
        this.profileDao = profileDao;
    }

    @RequestMapping(path = "/profile", method = RequestMethod.POST)
    public void addNewProfile(Profile profile){
        profileDao.createNewProfile(profile);
    }

}
