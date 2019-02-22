package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/yamaha")
public class HelloController {
	@RequestMapping("/Hello")
	public @ResponseBody String sayHello()
	{
		return "Hello! Spring MVC FirstExample.";
	}
	
	@RequestMapping("/xyz")
	public @ResponseBody String sayHello1()
	{
		return "Hello1! Spring MVC FirstExample.";
	}
	
	@RequestMapping("/adduser")
	public String sayHello2()
	{
		return "welcome";
	}
}
