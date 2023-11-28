package com.nowon.cho.domain.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ProductImgSaveDTO {
	private String[] tempKey;
	private String[] orgName;
	private boolean[] checkImg;
}
