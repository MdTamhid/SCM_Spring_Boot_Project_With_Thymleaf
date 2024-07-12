package com.tm.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.Entity.User;
import com.tm.Repo.UserRepository;
import com.tm.exception.UserNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	// Get user by id
	public User gerUserById(int id)
    {
		User user = userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user with id "+id+" is not persent!! in DB"));
		return user;
	}
	
	// Get all user
	public List<User> getAllUserData()
	{
		List<User> list = userRepo.findAll();
		return list;
	}
	
	// Insert user into the data base
	public  User saveUserData(User user)
	{
		 User save = userRepo.save(user);
		//return +save;
		return save;
	}
	
	// delter user data by id
    public void deleteUserDataById(int id)
    {
    	userRepo.deleteById(id);
    }
    
 // update by user data by id
	/*
	 * public String updateUserDataById(User user) { Optional<User> byId =
	 * userRepo.findById(user); if(byId.isPresent()) { User user = byId.get();
	 * return"User data updated with this id "+user; } return
	 * "User data updated"+byId;
	 * 
	 * }
	 */
	
}
