package controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}

}
