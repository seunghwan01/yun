package com.nowon.cho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustormerController {
	
	@GetMapping("/cs")
	public String cs() {
		return "customer/cs";
	}
	@GetMapping("/faq")
	public String faq() {
		return "customer/faq";
	}
	@GetMapping("/info")
	public String info() {
		return "customer/info";
	}
	@GetMapping("/qna")
	public String qna() {
		return "customer/qna";
	}
	


}
