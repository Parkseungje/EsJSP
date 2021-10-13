package com.example.Bbs.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	UserService uService;

	@GetMapping("/")
	@ResponseBody
	public List<UserVO> getUser() {
		return uService.getUser();
	}

}
