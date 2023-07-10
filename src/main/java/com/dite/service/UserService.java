package com.dite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dite.dot.UserLogin;
import com.dite.entity.User;
import com.dite.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void userregistor(User user) {
		this.userRepository.save(user);
		
	}

	public String userlogin(UserLogin userlogin) {
		
		User user = this.userRepository.findById(userlogin.getUid()).get();
		if(user.getPassword().equals(userlogin.getUpassword())) {
			return "login Succesfully";
		}
		return " login faild";
	}
}
