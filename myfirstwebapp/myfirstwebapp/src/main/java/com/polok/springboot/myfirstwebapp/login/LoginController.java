package com.polok.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

//	private Logger logger = LoggerFactory.getLogger(getClass());
//	/login => com.polok.springboot.myfirstwebapp.login.LoginController => login.jsp
	
	// http://localhost:8080/login?name=Ranga
	// Model
//	(@RequestParam String name, ModelMap model)
//	@ResponseBody
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String gotoLoginPage() {
//		model.put("name", name);
//		logger.debug("Request param is {}",name);
//		logger.info("I want this printed at info level");
//		logger.warn("I want this printed at warn level");
		
//		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PROD CODE
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	// login?name=Polok RequestParam
	public String gotoWelcomePage(@RequestParam String name,
			@RequestParam String password, ModelMap model) {
		
		if (authenticationService.authenticate(name, password)) {
		
			model.put("name", name);
//			model.put("password", password);
			
			// Authentication
			// name - polok
			// password - dummy
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
}
