package com.nowon.cho.service.impl;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.nowon.cho.domain.dto.ProductSaveDTO;
import com.nowon.cho.domain.entity.ProductEntity;
import com.nowon.cho.domain.entity.ProductEntityRepository;
import com.nowon.cho.service.ProductListService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service("productServiceProcess")
public class ProductListServiceProcess implements ProductListService{

	private final ProductEntityRepository repo;
	
	@Override
	public void listProcess(Model model) {
		
		Sort sort=Sort.by(Direction.DESC, "no");
		model.addAttribute("list", repo.findAll().stream()
										.map(ProductEntity::toProductListDTO)
										.collect(Collectors.toList())
				);
		
	}
	
}
