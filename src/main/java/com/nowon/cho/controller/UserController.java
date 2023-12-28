package com.nowon.cho.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nowon.cho.domain.dto.MemberDTO;
import com.nowon.cho.domain.entity.MemberEntity;
import com.nowon.cho.domain.entity.MemberEntityRepository;
import com.nowon.cho.service.MemberService;

@Controller
public class UserController {
	
	@Autowired
	MemberEntityRepository repo;
	@Autowired
	MemberService memservice;

	@GetMapping("/users/login")
	public String login() {
		return "users/login";
	}
	
	@GetMapping("/users/signup")
	public String signup() {
		return "users/signup";
	}
	
	@GetMapping("/users/signupagree")
	public String signupagree() {
		return "users/signupagree";
	}
	
	@PostMapping("/users/signup")
		public String signup(@ModelAttribute MemberDTO dto) {
		memservice.save(dto);
		return "redirect:/";
	}

}