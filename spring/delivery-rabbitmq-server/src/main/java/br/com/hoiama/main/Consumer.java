package br.com.hoiama.main;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    /**
     * @RabbitListener: É a anotação que marca o método como um listener;
     * @Payload: É a anotação que informa que o parâmetro vai receber o corpo da mensagem.
     * @param
     */
    @RabbitListener(queues ="${jsa.rabbitmq.queue}")
    public void receivedMenssage(String msg){
        System.out.println("Recieved Message: " + msg);
    }
}
