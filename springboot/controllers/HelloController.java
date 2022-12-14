package com.valtech.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam("name")String name) {
		  return "Hello "+name;
	}
	
   @GetMapping("/hi/{name}")
   @ResponseBody
   public String hi(@PathVariable("name")String name){
	   return "Hi "+name;
   }

}
