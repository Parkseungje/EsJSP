package com.example.Bbs.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	public List<UserVO> getUser();
	
	public void joinMember(UserVO uservo);
	
	public int check(String userId);
}
