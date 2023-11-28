package com.nowon.cho.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nowon.cho.domain.dto.ProductListDTO;
import com.nowon.cho.domain.dto.ProductSaveDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private long price;
	@Column(nullable = false)
	private int stock;
	@Column(nullable = false, columnDefinition = "text")
	private String content;
	
	public ProductListDTO toProductListDTO() {
		return ProductListDTO.builder()
							.no(no)
							.title(title)
							.price(price)
							.stock(stock)
							.content(content)
				.build();
	}
	
	
}
