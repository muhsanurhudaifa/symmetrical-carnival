package com.example.crud.controller;

import com.example.crud.entity.Profile;
import com.example.crud.service.ProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Profile addProfile(@RequestBody Profile profile){
        return  profileService.save(profile);
    }

    @GetMapping
    public List<Profile> getProfile(){
        return profileService.getProfile();
    }

    public ProfileService getProfileService() {
        return profileService;
    }

    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }
}
