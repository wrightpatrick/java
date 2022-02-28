package com.wright.login.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.wright.login.models.User;
import com.wright.login.repositories.UserRepository;
import com.wright.login.validations.LoginUser;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        
    	// reject if email is taken
    	Optional<User> applicant = this.userRepo.findByEmail(newUser.getEmail());
    	if(applicant.isPresent()) {
    		result.rejectValue("email", "emailInUse", "This email is already registered. Please use another email.");
    	
    	}
    	
    	// reject if password doesn't match confirmation
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "noMatch", "Passwords must match. Please try again.");
    	}
    	
    	// return null if result has validation errors
    	if(result.hasErrors()) {
    		return null;    		
    	} 
    	
    	else {
    		// if all succeed we can create a user
    		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    		
    		//securing new user's password
    		newUser.setPassword(hashed);
    		return this.userRepo.save(newUser);
    	}
    	
    }
    
    //login user if they exist
    public User login(LoginUser newLoginObject, BindingResult result) {
    	
    	// Find user in the DB by email
		Optional<User> potentialUser = this.userRepo.findByEmail(newLoginObject.getEmail());
		
		// check if email is in db
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "notFound", "This email is not yet registered.");
		}
		else {
			// check if hashed pass matches hashed pass in db
			if(!BCrypt.checkpw(newLoginObject.getPassword(), potentialUser.get().getPassword())) {
				result.rejectValue("password", "invalid", "Invalid Password.");
			}
		}
		// return null if result has errors
		if(result.hasErrors()) {
			return null;			
		}
		else {
			return potentialUser.get();
		}
    }
    
    //get one user by id
    public User findOneUser(Long id) {
    	return this.userRepo.findById(id).orElse(null);
    }
}
