package com.example.Bbs.post;

import java.util.ArrayList;

public class PostVO {

	//게시글코드
	private int post_code;
	//게시글명
	private String post_name;
	//게시글내용
	private String post_content;
	//게시글작성일
	private String post_registeration_date;
	//게시글수정일
	private String post_update_date;
	//게시글조회수
	private int post_hit;
	//카테고리코드
	private int category_code;
	//회원코드
	private int user_code;

	//첨부파일
	private ArrayList<File_listVO> f_list;

	public int getPost_code() {
		return post_code;
	}
	public void setPost_code(int post_code) {
		this.post_code = post_code;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public String getPost_registeration_date() {
		return post_registeration_date;
	}
	public void setPost_registeration_date(String post_registeration_date) {
		this.post_registeration_date = post_registeration_date;
	}
	public String getPost_update_date() {
		return post_update_date;
	}
	public void setPost_update_date(String post_update_date) {
		this.post_update_date = post_update_date;
	}
	public int getPost_hit() {
		return post_hit;
	}
	public void setPost_hit(int post_hit) {
		this.post_hit = post_hit;
	}
	public int getCategory_code() {
		return category_code;
	}
	public void setCategory_code(int category_code) {
		this.category_code = category_code;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	public ArrayList<File_listVO> getF_list() {
		return f_list;
	}
	public void setF_list(ArrayList<File_listVO> f_list) {
		this.f_list = f_list;
	}

	@Override
	public String toString() {
		return "PostVO [post_code=" + post_code + ", post_name=" + post_name + ", post_content=" + post_content
				+ ", post_registeration_date=" + post_registeration_date + ", post_update_date=" + post_update_date
				+ ", post_hit=" + post_hit + ", category_code=" + category_code + ", user_code=" + user_code
				+ ", f_list=" + f_list + "]";
	}


}
