package com.nowon.cho.controller;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nowon.cho.domain.dto.MemberDTO;
import com.nowon.cho.domain.entity.MemberEntity;
import com.nowon.cho.domain.entity.MemberEntityRepository;
import com.nowon.cho.service.MemberService;

@Controller
public class UserController {
	
	@Autowired
	MemberEntityRepository repo;
	@Autowired
	MemberService memservice;
	@Autowired
	private PasswordEncoder pe;

	@GetMapping("/users/login")
	public String login() {
		return "users/login";
	}
	
	@GetMapping("/users/signup")
	public String signup() {
		return "users/signup";
	}
	
	@GetMapping("/users/signupagree")
	public String signupagree() {
		return "users/signupagree";
	}
	
	@PostMapping("/users/signup")
	public String signup(MemberDTO dto) {
		memservice.save(dto);
		return "redirect:/";
	}
	
	 @PutMapping("/users/{no}")
	 @ResponseBody
	 public ResponseEntity<String> changePassword(@RequestParam String currentpass, @RequestParam String newpass, @RequestParam String newpassagain, Principal principal) {
	        // 현재 패스워드 확인 및 새 패스워드 일치 여부 검사 (단순 예시)
		 String userEmail = principal.getName(); // 현재 로그인한 사용자의 이메일
		 Optional<MemberEntity> optionalMember = repo.findByEmail(userEmail);

		 if (optionalMember.isPresent()) {
			 MemberEntity member = optionalMember.get();

			 // 패스워드 일치 여부 확인
			 if (pe.matches(currentpass, member.getPass())) {
                // 새 패스워드 일치 여부 확인
                if (newpass.equals(newpassagain)) {
                    // 패스워드 업데이트
                    member.setPass(pe.encode(newpass));
                    repo.save(member);
                    return ResponseEntity.ok("비밀번호가 성공적으로 변경되었습니다.");
                } else {
                    return ResponseEntity.badRequest().body("새 패스워드가 일치하지 않습니다.");
                }
            } else {
                return ResponseEntity.badRequest().body("현재 패스워드가 일치하지 않습니다.");
            }
        } else {
            return ResponseEntity.badRequest().body("사용자를 찾을 수 없습니다.");
	        }
	    }

}