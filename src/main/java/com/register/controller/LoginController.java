package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.register.model.Login;
import com.register.repository.LoginRepo;

@Controller
public class LoginController {
	
	@Autowired
	private LoginRepo repo;
	
	@GetMapping("/login")
	public String formpage()
	{
		return "login";
	}
	
	@RequestMapping("/submit-form")
	public String saveuser(Login login)
	{
		Login s = repo.save(login);
		
		if(s!=null)
		{
			return "success";
		}
		
		else
		{
			return "unsuccess";
		}
		
		
	}

}
