package com.project.e_wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.e_wallet.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@RestController
//@RequestMapping("/api")
public class UserController {
	@Autowired 
	EntityManager em;
	
//	@GetMapping("/user")
//	@Transactional
//	public void saveUser(@RequestBody User theuser) {
//		System.out.println(theuser);
//		em.merge(theuser);
//		System.out.println("its working fine!");
//	}
//	@PostMapping("/user")
//	public User saveUser(@RequestBody User theuser) {
//		em.merge(theuser);
//		return theuser;
//	}
	
}
