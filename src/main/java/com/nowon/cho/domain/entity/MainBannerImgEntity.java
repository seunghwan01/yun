package com.nowon.cho.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MainBanner")
@Entity
public class MainBannerImgEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	@Column(nullable = false)
	private String bucketKey;
	@Column(nullable = false)
	private boolean isEnable;
	@Column(nullable = false)
	private long orderNumber;
	private String title;
	private String sub;
	private String UrlLink;
	private String orgName;
	
}
