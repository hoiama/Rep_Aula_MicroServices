package br.com.hoiama.main;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderQueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * Queue: É um objeto que representa a fila configurada;
     */
    @Autowired
    private Queue queue;

    /**
     * classe helper para acessar e enviar mensagens para RabbitMQ de forma síncrona;
     * @method rabbitTemplate possui recebe os parâmetro: routingKey(nome da file) e message(mensagem a ser enviada).
     * @param order
     */
    public void send(String order){
        rabbitTemplate.convertAndSend(this.queue.getName(), order);
    }

}
