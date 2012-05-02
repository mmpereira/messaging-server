package com.commandcenter.messaging.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ctx.registerShutdownHook();
		System.out.println("Server");
	}
}
