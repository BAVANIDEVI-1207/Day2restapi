package com.example.project.que1controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class que1 {
	@Value("Bavani")
public String name;
@RequestMapping("/day2")
public String getname() {
	return "Welcome" +name;
	
}

}
