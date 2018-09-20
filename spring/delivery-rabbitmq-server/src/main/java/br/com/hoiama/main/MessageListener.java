package br.com.hoiama.main;

import org.springframework.amqp.core.Message;

public class MessageListener implements org.springframework.amqp.core.MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(new String(message.getBody()));
    }
}
