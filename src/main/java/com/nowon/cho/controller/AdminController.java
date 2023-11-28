package com.nowon.cho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nowon.cho.service.ProductListService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class AdminController {
	
	private final ProductListService service;

	@GetMapping("/admin")
	public String admin() {
		return "admin/admin";
	}
	@GetMapping("/productList")
	public String productList(Model model) {
		log.debug(model+"");
		service.listProcess(model);
		return "admin/admin-product-list";
	}
	@GetMapping("/productAdd")
	public String productAdd() {
		return "admin/admin-product-add";
	}
	
}
