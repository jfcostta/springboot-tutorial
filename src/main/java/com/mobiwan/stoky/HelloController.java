package com.mobiwan.stoky;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {
	/** @ref https://www.baeldung.com/spring-requestmapping */
	@RequestMapping(
		value = { "/", "/index" }, 
		method = RequestMethod.GET)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "*", method = RequestMethod.GET)
	@ResponseBody
	public String getFallback() {
    	return "Endpoint not defined: fallback for GET Requests";
	}
	
}