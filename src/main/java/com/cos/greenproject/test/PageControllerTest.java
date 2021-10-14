package com.cos.greenproject.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageControllerTest {
	
	@GetMapping("/test/loginForm")
	public String t1() {
		return "user/loginForm";
	}
	
	@GetMapping("/test/joinForm")
	public String t2() {
		return "user/joinForm";
	}
	
	@GetMapping("/test/board/saveForm")
	public String t3() {
		return "board/saveForm";
	}
	
}
