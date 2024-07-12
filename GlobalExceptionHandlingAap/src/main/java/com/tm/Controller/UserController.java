package com.tm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tm.Entity.User;
import com.tm.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	// Save user detail
	@PostMapping("/user")
	public User saveUserDetail(@RequestBody User suer)
	{
		User userData = userService.saveUserData(suer);
		return userData;
	}
	
	// get user detail by id
	@GetMapping("/getUser/{id}")
	public User getUserDetailById(@PathVariable int id)
	{
		 User byId = userService.gerUserById(id);
		return byId;
	}
	
	// get all user detail
	@GetMapping("/getAlluser")
	public List<User> getAllUserDetail()
	{
		List<User> list = userService.getAllUserData();
		return list;
	}
	
	// delete user detail by id
	@DeleteMapping("/deleteUser/{id}")
	public String DeleteUserData(@PathVariable int id)
	{
		userService.deleteUserDataById(id);
		return"User data delete with this "+id;
	}
	
	/*
	 * @PutMapping("/update") public String upDateByid(@RequestBody User user) {
	 * User user=new User(); String data = userService.updateUserDataById(user);
	 * 
	 * return data; }
	 */
	
	// Have to complete update user detail latter?
	
	

}
