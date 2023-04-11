package com.polok.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
//	/login => com.polok.springboot.myfirstwebapp.login.LoginController => login.jsp
	
	@RequestMapping("login")
//	@ResponseBody
	public String gotoLoginPage() {
		return "login";
	}
}
