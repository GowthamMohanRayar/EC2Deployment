package com.example.Ec2Deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String printHello() {
		return "hello";
	}

	@GetMapping("/say")
	public String sayHello() {
		return "hello";
	}

	@GetMapping("/says")
	public String saysHello() {
		return "saysHello";
	}

	@GetMapping("/malamalamalemale")
	public String malamalamalemale() {
		return "malamalamalemale";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}

}