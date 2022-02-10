package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
//@RequestMapping(value = "user")
public class UesrController<E> {
	@Autowired
	UserService userService;
	
	@RequestMapping("/getAllUser")
public List<User> getAllUser() {
		
	return userService.getAllUsers();
}
	
	@PostMapping("/save")
	public String saveAllUser(User user) {
		userService.save(user);
		return "Save";
	}
	@PutMapping("/update")
	public String update(User user) {
		userService.upadte(user);
		return "Updated";
	}
		
	

}
