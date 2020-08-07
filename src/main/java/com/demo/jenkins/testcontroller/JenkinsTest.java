package com.demo.jenkins.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JenkinsTest {

	@GetMapping
	public String TestReturn() {
		return "jenkins is configured";
	}
}
