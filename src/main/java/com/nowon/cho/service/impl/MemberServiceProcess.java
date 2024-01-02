package com.nowon.cho.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nowon.cho.domain.dto.MemberDTO;
import com.nowon.cho.domain.entity.MemberEntityRepository;
import com.nowon.cho.security.MyRole;
import com.nowon.cho.service.MemberService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceProcess implements MemberService{

	@Autowired
	MemberEntityRepository memRepo;
	
	@Autowired
	PasswordEncoder pe;
	
	@Override
	@Transactional
	public void save(MemberDTO memberdto) {
		memRepo.save(memberdto.getDTO(pe)
				.addRole(MyRole.USER));
	}



}
