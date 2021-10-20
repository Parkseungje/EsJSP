package com.example.Bbs.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserVO> getUser() {

		return userMapper.getUser();
	}
	
	public void joinMember(UserVO uservo) {
		
		userMapper.joinMember(uservo);
		
	}
	
	public int idCheck(String userId) {
		return userMapper.check(userId);
	}
}
