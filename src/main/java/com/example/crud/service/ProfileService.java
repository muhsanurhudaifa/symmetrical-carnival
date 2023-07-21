package com.example.crud.service;

import com.example.crud.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.repository.ProfileRepository;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile save(Profile profile){
        return profileRepository.save(profile);
    }

    public List<Profile> getProfile(){
        return profileRepository.findAll();
    }

    public ProfileRepository getEmployeeRepository() {
        return profileRepository;
    }

    public void setProfileRepository(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
}
