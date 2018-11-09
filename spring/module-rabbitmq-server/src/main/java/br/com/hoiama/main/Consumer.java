package br.com.hoiama.main;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="${jsa.rabbitmq.queue}") //Ouve a fila registrada em "queue" e a envia para "RabbitHandler" ;
public class Consumer {

    /**
     * @RabbitListener: É a anotação que marca o método como um listener;
     * @Payload: É a anotação que informa que o parâmetro vai receber o corpo da mensagem.
     * @param
     */
    @RabbitHandler
    public void receivedMenssage(String msg){
        System.out.println("Recieved Message: " + msg);
    }
}
