package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home()
	{
		
		return "home.jsp";
		
	}
	
	@RequestMapping("contact")
	public String contact()
	{
		//System.out.println("hi");
		return "contact.jsp";
		
	}
	
	@RequestMapping("classes")
	public String classes()
	{
		//System.out.println("hi");
		return "classes.jsp";
		
	}
	
	@RequestMapping("about")
	public String about()
	{
		
		return "about.jsp";
		
	}
	
	

}
