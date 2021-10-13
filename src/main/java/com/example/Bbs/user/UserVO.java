package com.example.Bbs.user;

public class UserVO {

	//회원코드
	private int user_code;
	//회원이름
	private String user_name;
	//회원아이디
	private String user_id;
	//회원패스워드
	private String user_password;
	//회원이메일
	private String user_email;
	//회원가입일
	private String user_registeration_date;
	//회원등급
	private String user_class;
	//회원이미지경로
	private String user_image_path;
	//회원권한
	private String user_authority;


	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_registeration_date() {
		return user_registeration_date;
	}
	public void setUser_registeration_date(String user_registeration_date) {
		this.user_registeration_date = user_registeration_date;
	}
	public String getUser_class() {
		return user_class;
	}
	public void setUser_class(String user_class) {
		this.user_class = user_class;
	}
	public String getUser_image_path() {
		return user_image_path;
	}
	public void setUser_image_path(String user_image_path) {
		this.user_image_path = user_image_path;
	}
	public String getUser_authority() {
		return user_authority;
	}
	public void setUser_authority(String user_authority) {
		this.user_authority = user_authority;
	}


	@Override
	public String toString() {
		return "UserVO [user_code=" + user_code + ", user_name=" + user_name + ", user_id=" + user_id
				+ ", user_password=" + user_password + ", user_email=" + user_email + ", user_registeration_date="
				+ user_registeration_date + ", user_class=" + user_class + ", user_image_path=" + user_image_path
				+ ", user_authority=" + user_authority + "]";
	}


}
