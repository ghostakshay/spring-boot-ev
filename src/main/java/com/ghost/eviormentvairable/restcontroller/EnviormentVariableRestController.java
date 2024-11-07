package com.ghost.eviormentvairable.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnviormentVariableRestController {

	@Value("${app.api.key}")
	private String apiKey;
	
	@Value("${app.db.url}")
	private String dbUrl;
	
	@Value("${app.db.username}")
	private String dbUsername;


	@GetMapping("/")
	public String get() {
		return "Hello Good Morning.";
	}

	@GetMapping("/db")
	public String getDbUrl() {
		return dbUrl;
	}

	@GetMapping("/key")
	public String getKey() {
		return apiKey;
	}
	
	@GetMapping("/username")
	public String getUsername() {
		return dbUsername;
	}
}
