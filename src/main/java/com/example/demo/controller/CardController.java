package com.example.demo.controller;

import com.example.demo.dto.CardRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RestController
@RequestMapping("/cards")
public class CardController {
	
	@GetMapping
	public String getMethodName(@RequestParam String param) {
		log.info("Buena buzz");
		return "Al infinito y mas alla";
	}
	
	@PostMapping
	public String postMethodName(@RequestBody CardRequestDTO cardRequestDTO) {
		//TODO: process POST request
		return "SAVED";
	}

}
