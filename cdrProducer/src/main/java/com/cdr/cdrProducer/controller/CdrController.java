package com.cdr.cdrProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cdr")
public class CdrController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/Path")
	public String testUrl() {
		return "path is setup perfectly";
	}
	@PostMapping
	public ResponseEntity<String> sendCdr(@RequestBody String payload) {
		System.out.println(payload);
		kafkaTemplate.send("cdr-events", payload);
		 String printMessage= "CDR sent to Kafka";
		return new ResponseEntity<String>(printMessage, HttpStatus.ACCEPTED);
	}
}
