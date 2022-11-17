package com.comdata.springkafkadocker.springkafkadocker.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "my_topic", groupId = "my_group_id")
	public void getMessage(String message) {

		try {
			log.info(message);
			
		} catch (Exception e) {
			
			log.error("ERROR");
		}

	}

}
