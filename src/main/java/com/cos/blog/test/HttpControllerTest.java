package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(data)
@RestController
public class HttpControllerTest {

	//인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.
	//http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest() {
		return "get요청";
	}
	
	@PostMapping("/http/post")
	public String postTest() {
		return "post요청";
	}
	
	@PutMapping("http/put")
	public String putTest() {
		return "put요청";
	}
	
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "delete요청";
	}
}
