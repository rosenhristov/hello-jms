package com.rosenhristov;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "emailFactory")
    public void receiveMessage(Email email) {
        System.out.printf("Received <%s>\n", email);
    }
}
