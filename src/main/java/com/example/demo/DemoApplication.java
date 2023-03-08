package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World with Love Test and test!";
	}

	@RequestMapping("/hello")
    String testOne() {
        return "Its calling the Hi & Hello world Together  and test!";
    }

	@GetMapping("/getone")
	public @ResponseBody ResponseEntity<String> get() {
    return new ResponseEntity<String>("GET Response New", HttpStatus.OK);
	}

	@PostMapping("/testtwo")
    public @ResponseBody ResponseEntity<String> posttwo() {
            return new ResponseEntity<String>("POST Response New", HttpStatus.OK);
    }

}
