package com.polok.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
//	/login => com.polok.springboot.myfirstwebapp.login.LoginController => login.jsp
	
	// http://localhost:8080/login?name=Ranga
	// Model
	@RequestMapping("login")
//	@ResponseBody
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PROD CODE
		return "login";
	}
}
