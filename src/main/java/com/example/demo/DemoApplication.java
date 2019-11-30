package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
public class DemoApplication {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/users/{username}")
    public String getUser(@PathVariable("username") String username) {
       return username;
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
