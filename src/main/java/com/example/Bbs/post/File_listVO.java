package com.example.Bbs.post;

public class File_listVO {

	//파일코드
	private int file_code;
	//파일명
	private String file_name;
	//파일경로
	private String file_path;
	//파일사이즈
	private int file_size;

	public int getFile_code() {
		return file_code;
	}
	public void setFile_code(int file_code) {
		this.file_code = file_code;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	@Override
	public String toString() {
		return "File_list_VO [file_code=" + file_code + ", file_name=" + file_name + ", file_path=" + file_path
				+ ", file_size=" + file_size + "]";
	}



}
