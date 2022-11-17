package com.comdata.springkafkadocker.springkafkadocker.Controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comdata.springkafkadocker.springkafkadocker.Service.KafkaProducer;

@RestController
public class KafkaController {

	private final KafkaProducer producer;
	

	public KafkaController(KafkaProducer producer) {
		this.producer = producer;
	}

	@PostMapping("/comunication")
	public void writeMessageToTOpic(@RequestParam("message") String message) {

		this.producer.writeMessage(message);
	}
}
