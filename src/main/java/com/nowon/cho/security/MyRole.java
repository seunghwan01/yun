package com.nowon.cho.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MyRole {
	USER("일반유저"),
	ADMIN("관리자");
	private final String roleName;
}
