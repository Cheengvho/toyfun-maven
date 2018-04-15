package com.cheen.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cheen.pojo.User;

@Controller
public class SessionController {

	@RequestMapping("/this")
	public String mymain(HttpSession session) {
		session.setAttribute("uname", "cheen");
		return "";
	}
	@RequestMapping("/testSession")
	public String mydemo(@SessionAttribute("uname") String uname) {
		System.out.println(uname);
		return "";
	}
	@RequestMapping("/ajaxdemo")
	public @ResponseBody User ajaxdemo(@RequestBody User u) {
		System.out.println("id"+u.getUname()+"ppp");
		System.out.println("id"+u.getUpassword()+"aaa");
		return u;
	}
	
	@RequestMapping(value="/ajaxdemo2",produces = {"application/text;charset=UTF-8"})
	public @ResponseBody String ajaxdemo2(String myname) {
		System.out.println(myname);
		String encodingTest = "中文传值内容";
		return encodingTest;
	}
	
	
	@RequestMapping("/jsondemo")
	public String getJson() {
		
		return "json";
	}
}
