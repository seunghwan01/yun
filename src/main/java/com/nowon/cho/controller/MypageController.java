package com.nowon.cho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {

	@GetMapping("/myharmony")
	public String myharmony() {
		return "mypage/mypage";
	}
	@GetMapping("/order")
	public String order() {
		return "mypage/mypage-order";
	}
	@GetMapping("/cancel")
	public String cancel() {
		return "mypage/mypage-cancel";
	}
	@GetMapping("/review")
	public String review() {
		return "mypage/mypage-review";
	}
	@GetMapping("/ask")
	public String ask() {
		return "mypage/mypage-ask";
	}
	
}
