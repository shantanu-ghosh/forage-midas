package com.jpmc.midascore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.jpmc.midascore.foundation.Transaction;

@Component
public class KafkaConsumer {
	static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "${general.kafka-topic}", groupId = "${general.kafka-topic}")
	public void listenOnMessages(Transaction message) {
		logger.info("Received message :: " + message);
	}
}
