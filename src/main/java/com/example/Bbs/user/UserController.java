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
	
	// 회원가입폼 이동
	@GetMapping("/userRegisteration")
	public String userRegisteration() {
		
		return "user/userRegisteration";
	}
	
	// 회원가입기능
	@PostMapping("/userJoin")
	public String userJoin(UserVO uservo) {
		
		String user_id = uservo.getUser_id();
		String user_name = uservo.getUser_name();
		String user_email = uservo.getUser_email();
		String user_password = uservo.getUser_password();
		String user_password_check = uservo.getUser_password_check();
		
		int checkResult = uService.idCheck(user_id);
		
		if(checkResult != 0) {
			
		}else {
				
				if(user_id==null||user_id=="") return "user/userRegisteration";
				if(user_name==""||user_name==null) return "user/userRegisteration";
				if(user_email==""||user_email==null)return "user/userRegisteration";
				if(user_password==""||user_password==null) return "user/userRegisteration";
				if(user_password_check==""||user_password_check==null) return "user/userRegisteration"; 			
				
				uService.joinMember(uservo);		
					
		}
		return "user/userRegisteration";
	}
	
	// 아이디 동적중복체크
	@PostMapping("/idCheck")
	@ResponseBody
	public String idCheck(String userId) {
		
		//logger.info("userId진입!!!!!!!!!!!!!!!!");
		
		int checkResult = uService.idCheck(userId);
		
		if(checkResult != 0) {
			return "fail";
		}else {
			return "success";
		}
		
	}

}
