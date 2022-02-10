package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	//@Autowired
	//private AddressRepository addressRepository;

	@Override
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> userlist = userRepository.findAll();
		return userlist;
	}

	@Override
	@Transactional
	public User getUsers(Long id) {
		Optional<User> user=userRepository.findById(id);
		return   user.get();
	}

	@Override
	@Transactional
	public int save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public User upadte(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional

	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
