package com.cheen.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cheen.pojo.Order;
import com.cheen.pojo.User;

@Controller
public class MyTestController {
	@RequestMapping("/demo1")
	public String mytest1(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("name:"+name);
		return "new";
	}

	@RequestMapping(value="/demo2")
	public String mytest2(int id) {
		System.out.println("id:"+id);
		return "new";
	}
	
	@RequestMapping(value="/demo3")
	public String mytest3(@RequestParam(value="myname")String name) {
		System.out.println("myname:"+name);
		return "new";
	}
	
	@RequestMapping(value="/demo4/{id}")
	public String mytest4(@PathVariable(value="id")int id) {
		System.out.println("id:"+id);
		return "new";
	}
	
	@RequestMapping(value="/pojo.jsp")
	public String findpojo() {
		
		return "pojo";
	}
	
	@RequestMapping(value="/pojo1")
	public String mypojo1(Order order) {
		System.out.println("oaddress:"+order.getOaddress());
		System.out.println("odate:"+order.getOdate());
		return "new";
	}
	
	@RequestMapping(value="/pojo2")
	public String mypojo2(Order order) {
		User u = new User();
		System.out.println("oaddress:"+order.getOaddress());
		System.out.println("uname:"+u.getUname());
		return "new";
	}
}
