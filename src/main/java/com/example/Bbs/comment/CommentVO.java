package com.example.Bbs.comment;

public class CommentVO {

	//댓글코드
	private int comment_code;
	//댓글내용
	private String comment_content;
	//댓글작성일
	private String comment_registeration_date;
	//댓글수정일
	private String comment_update_date;
	//게시글코드
	private int post_code;
	//회원코드
	private int user_code;


	public int getComment_code() {
		return comment_code;
	}
	public void setComment_code(int comment_code) {
		this.comment_code = comment_code;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public String getComment_registeration_date() {
		return comment_registeration_date;
	}
	public void setComment_registeration_date(String comment_registeration_date) {
		this.comment_registeration_date = comment_registeration_date;
	}
	public String getComment_update_date() {
		return comment_update_date;
	}
	public void setComment_update_date(String comment_update_date) {
		this.comment_update_date = comment_update_date;
	}
	public int getPost_code() {
		return post_code;
	}
	public void setPost_code(int post_code) {
		this.post_code = post_code;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}

	@Override
	public String toString() {
		return "CommentVO [comment_code=" + comment_code + ", comment_content=" + comment_content
				+ ", comment_registeration_date=" + comment_registeration_date + ", comment_update_date="
				+ comment_update_date + ", post_code=" + post_code + ", user_code=" + user_code + "]";
	}




}
