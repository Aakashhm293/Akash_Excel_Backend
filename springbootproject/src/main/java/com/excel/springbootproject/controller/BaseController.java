package com.excel.springbootproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/home")
	public ResponseEntity<String> homeGetReq() {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
	}

	@GetMapping("/hello")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Aww Snap, The server is broken");
	}

	@PostMapping("/request/{s}")
	public ResponseEntity<String> getMessageWithString(@PathVariable String s) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("The String that you have entered in the URL is = " + s);
	}

	@PostMapping("/request1/{str}")
	public ResponseEntity<String> getMessageWithParam(@RequestParam String name, @PathVariable String str) {
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body("The String that you have entered in the URL is = " + name + str);
	}

	@PutMapping("/put/{str}")
	public ResponseEntity<String> putMessage(@PathVariable String str) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Put Api Invoked");
	}

	@DeleteMapping("/delete/{str}")
	public ResponseEntity<String> deleteMessage(@PathVariable String str) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Delete Api Invoked");
	}
	
}
