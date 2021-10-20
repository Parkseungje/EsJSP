package com.example.Bbs.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

	@GetMapping("/postIn")
	public String postIn() {
		
		return "post/postIn";
	}
}
