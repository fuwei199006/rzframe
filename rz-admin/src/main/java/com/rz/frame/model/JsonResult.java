package com.rz.frame.model;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JsonResult<T> {
	
	private int code;
	private String message;
	private List<T> data;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<T> getData() {
		return data;
	}
	
	public void setData(List<T> data) {
		this.data = data;
	}
}
