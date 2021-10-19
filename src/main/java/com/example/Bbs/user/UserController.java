package com.example.Bbs.user;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	//set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	UserService uService;

	@GetMapping("/json")
	@ResponseBody
	public List<UserVO> getUser() {
		return uService.getUser();
	}
	
	@GetMapping("/userRegisteration")
	public String userRegisteration() {
		
		return "userRegisteration";
	}
	
	@PostMapping("/userJoin")
	public String userJoin(UserVO uservo) {
		
		System.out.println(uservo);
	    uService.joinMember(uservo);
		
		return "userRegisteration";
	}
	
	@PostMapping("/idCheck")
	@ResponseBody
	public String idCheck(String userId) {
		
		//logger.info("userId진입!!!!!!!!!!!!!!!!");
		
		int result = uService.idCheck(userId);
		
		if(result != 0) {
			return "fail";
		}else {
			return "success";
		}
		
	}

}
