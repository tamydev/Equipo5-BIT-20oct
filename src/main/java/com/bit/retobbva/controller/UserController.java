package com.bit.retobbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.retobbva.persistance.main.Usuario;
import com.bit.retobbva.persistance.mock.Auth;
import com.bit.retobbva.service.UserService;

@RestController
public class UserController {

	@Autowired UserService userService;

	@RequestMapping(value={"/client"})
	@GetMapping
	public ResponseEntity<?> getClient(@RequestBody Auth auth) {
		
		if(userService.isAuth(auth)) {
			Usuario usuario = userService.findOne(auth.getUser());
			
		}
			
		return ResponseEntity.ok("");
		
	}

}
