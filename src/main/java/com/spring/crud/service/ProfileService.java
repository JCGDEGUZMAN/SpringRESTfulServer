package com.spring.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.crud.models.Profile;
import com.spring.crud.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService {

	@Autowired
	private ProfileRepository repository;
	
	@Override
	public List<Profile> showProfiles() {
		
		List<Profile> profile = (List<Profile>) repository.findAll();
		
		return profile;
	}

	@Override
	public Profile createNewProfile(Profile newProfile) {
		
		Profile Profile = repository.save(newProfile);
		
		return Profile;
	}

	@Override
	public Profile showProfile(long id) {
		
		Profile profile = repository.findById(id);
		
		return profile;
	}

}
