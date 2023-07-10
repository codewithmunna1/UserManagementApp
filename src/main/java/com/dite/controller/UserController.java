package com.dite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dite.entity.User;
import com.dite.service.UserService;


@RestController
public class UserController {

		@Autowired
		private UserService userService;
		
		@PostMapping("/registors")
		public void userRegistor(@RequestBody User user) {
		 this.userService.userregistor(user );
		}
		
		@GetMapping ("/registors")
		public void UserLogin(@RequestBody com.dite.dot.UserLogin userlogin) {
			this.userService.userlogin(userlogin);
		}
}
