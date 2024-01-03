package com.nowon.cho.domain.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.nowon.cho.domain.dto.MemberDTO;
import com.nowon.cho.security.MyRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HermonyMember")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String pass;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone;

	@Builder.Default
	@Enumerated(EnumType.STRING)
	@CollectionTable(name = "HarmonyRole")
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<MyRole> roles=new HashSet<>();
	public MemberEntity addRole(MyRole role) {
		roles.add(role);
		return this;
	}

	@OneToOne(mappedBy = "member", fetch = FetchType.LAZY)
	private CartEntity cart;

	public MemberEntity getDTO(MemberDTO memberDTO) {
		this.email = memberDTO.getEmail();
		this.pass = memberDTO.getPass();
		this.name = memberDTO.getName();
		this.phone = memberDTO.getPhone();
		return this;
	}
	
	
}
