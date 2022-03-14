package com.Securityrememberme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
