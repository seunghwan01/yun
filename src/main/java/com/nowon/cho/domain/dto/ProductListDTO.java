package com.nowon.cho.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class ProductListDTO {
	
	private long no;
	private String title;
	private long price;
	private int stock;
	private String content;
	
}
