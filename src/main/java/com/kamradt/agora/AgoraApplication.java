package com.kamradt.agora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@SpringBootApplication
@RestController
public class AgoraApplication {

	@CrossOrigin
	@GetMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("message", "Hello, World");
		return model;
	}

	public static void main(String[] args) {
		SpringApplication.run(AgoraApplication.class, args);
	}

}

