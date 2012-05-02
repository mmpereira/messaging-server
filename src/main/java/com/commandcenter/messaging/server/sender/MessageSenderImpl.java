package com.commandcenter.messaging.server.sender;

import org.springframework.amqp.core.AmqpTemplate;

public class MessageSenderImpl implements MessageSender {

	private volatile AmqpTemplate amqpTemplate;

	public void send(String message) {
		this.amqpTemplate.convertAndSend("ccExchange", "some.routing.key", message);
	}

}
