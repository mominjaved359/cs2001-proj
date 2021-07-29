package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("user")
	public String user()
	{
		return "user.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user)
	{ 
		repo.save(user);
		return "home.jsp";
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam int id)
	{ 
		ModelAndView mv = new ModelAndView("user.jsp");
		User user = repo.findById(id).orElse(null);
		mv.addObject(user);
		return mv;
	}

}
