package com.vw.cloud.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloServerResource {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
