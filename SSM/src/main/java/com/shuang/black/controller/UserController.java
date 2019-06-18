package com.shuang.black.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shuang.black.entity.User;
import com.shuang.black.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImpl serviceImpl;
	
	@RequestMapping("/index")
	public String indexJsp(){
		System.out.println("index1");
		return "user";
		
	}
	
	/**
	 * 重定向方法一
	 * @param response
	 */
	@RequestMapping("/redirect1")
	public void redirect1(HttpServletResponse response){
		try {
			response.sendRedirect("https://www.baidu.com/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 重定向方法二
	 */
	@RequestMapping("/redirect2")
	public String redirect2(){
		return "redirect:https://www.baidu.com/";
	}
	
	@ResponseBody
	@RequestMapping("/insert")
	public String insertUser(HttpServletRequest request){
		System.out.println("insertUser");
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/findOne/{userId}")
	public User selectUser(@PathVariable("userId") String userId,HttpServletRequest request){
		if(userId==null){
			userId = "1";
			System.out.println("userId为空，将默认设置为:"+userId);
		}
		System.out.println(request.getParameter("userId"));
		User user = serviceImpl.findOne(Integer.valueOf(userId));
		System.out.println(user);
		return user;
	}
}
