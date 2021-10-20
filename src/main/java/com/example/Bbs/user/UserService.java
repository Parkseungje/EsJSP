package com.example.Bbs.user;

import java.util.List;

public interface UserService {
	public List<UserVO> getUser();
	
	public void joinMember(UserVO uservo);
	
	public int idCheck(String userId);
}