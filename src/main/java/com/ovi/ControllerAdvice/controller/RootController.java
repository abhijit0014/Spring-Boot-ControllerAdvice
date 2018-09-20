package com.ovi.ControllerAdvice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ovi.ControllerAdvice.exception.ResourceNotFoundException;

@RestController
public class RootController {

	@RequestMapping("/notFound")
	public String notFound(){
		throw new ResourceNotFoundException("Resource Not Found");
	}
	
	@RequestMapping("/exception")
	public void exception(){
		int res = 2/0;
	}
}
