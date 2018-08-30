package com.internousdev.glanq.action;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	private String loginId;
	private String password;
	private String categoryId;
	private Map<String,Object>session;

	public String execute(){
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();


	}
}
