package com.cdr.cdrConsumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CdrConsumerService {

	@KafkaListener(topics = "cdr-events", groupId = "cdr-consumer-group")
	public void consumeCdr(String message) {
		// Process the CDR payload (e.g., parse, store in DB, etc.)
		System.out.println("Consumed CDR: " + message);
		
		System.out.println("Message from event");
	}
}
