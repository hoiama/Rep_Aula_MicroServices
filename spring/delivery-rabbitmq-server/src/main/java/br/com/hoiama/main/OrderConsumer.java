package br.com.hoiama.main;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    /**
     * @RabbitListener: É a anotação que marca o método como um listener;
     * @Payload: É a anotação que informa que o parâmetro vai receber o corpo da mensagem.
     * @param fileBody
     */
    @RabbitListener(queues = {"${queue.order.name}"})
    public void receiver(@Payload String fileBody){
    }
}
