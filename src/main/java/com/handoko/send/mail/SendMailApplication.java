package com.handoko.send.mail;

import com.handoko.send.mail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendMailApplication {

	@Autowired
	private SendEmailService sendEmailService;

	public static void main(String[] args) {
		SpringApplication.run(SendMailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerWhenStart() {
		sendEmailService.sendEmail("handoko.ben@gmail.com", "Halo there", "Test");
	}
}
