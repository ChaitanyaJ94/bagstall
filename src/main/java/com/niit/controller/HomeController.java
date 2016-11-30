package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	
	@RequestMapping("/")
	public ModelAndView Home()
	{
		return new ModelAndView("HomePage");
	}
	
	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		return new ModelAndView("Login");
	}
   
	@RequestMapping("/Register")
	public ModelAndView Register()
	{
		return new ModelAndView("Register");
	}
@RequestMapping("/LandingPage")
public ModelAndView LandingPage()
{
	return new ModelAndView("LandingPage");
}
}
