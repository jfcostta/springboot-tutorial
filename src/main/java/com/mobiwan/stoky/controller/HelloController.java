package com.mobiwan.stoky.controller;

import com.mobiwan.stoky.domain.Hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    /** @ref https://spring.io/guides/gs/rest-service/ */
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public Hello greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Hello(counter.incrementAndGet(), String.format(template, name));
	}
}