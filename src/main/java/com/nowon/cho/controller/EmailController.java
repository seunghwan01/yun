//package com.nowon.cho.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class EmailController {
//
//	@PostMapping("login/mailConfirm")
//	@ResponseBody
//	String mailConfirm(@RequestParam("email") String email) throws Exception {
//
//		   String code = sendSimpleMessage(email);
//		   System.out.println("인증코드 : " + code);
//		   return code;
//		}
//
//	private String sendSimpleMessage(String email) {
//		return null;
//	}
//}ss