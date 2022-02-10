package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.User;
public interface UserService {
	
	public List<User> getAllUsers() ;
	public User getUsers(Long id) ;
	public int save(User user);
	public User upadte(User user);
	public boolean remove(int id) ;
	
}
