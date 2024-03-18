package com.social.as.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String homeControllerHandler() {
		return "AS SOCIAL";
	}
}