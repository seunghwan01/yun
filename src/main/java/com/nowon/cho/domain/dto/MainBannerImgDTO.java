package com.nowon.cho.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class MainBannerImgDTO {
	
	private String tempKey;
	private boolean isEnable;
	private int orderNumber;
	private String title;
	private String sub;
	private String UrlLink;
	private String orgName;
}
