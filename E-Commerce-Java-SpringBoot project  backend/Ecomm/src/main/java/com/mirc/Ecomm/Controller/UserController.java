package com.mirc.Ecomm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirc.Ecomm.Service.UserService;
import com.mirc.Ecomm.entity.UserDetails;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public List<UserDetails> getUser() {
		return userService.getUser();
	}
@GetMapping("/{uid}")
public UserDetails getUserById(@PathVariable Long uid) {
	
	return userService.getUserById(uid);
}

@PostMapping("/add")
public UserDetails addUser(@RequestBody UserDetails userDetails) {
	
	return userService.addUser(userDetails);
	
}

@DeleteMapping("/delete/{uid}")
public UserDetails deleteUser(@PathVariable Long uid) {
	
	return userService.deleteUser(uid);
}
}
