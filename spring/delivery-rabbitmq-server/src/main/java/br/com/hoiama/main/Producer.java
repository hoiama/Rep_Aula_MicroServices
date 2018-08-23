package br.com.hoiama.main;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    /**
     * Classe helper para acessar e enviar mensagens para RabbitMQ de forma síncrona;
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${jsa.rabbitmq.exchange}")
    private String exchange;

    @Value("${jsa.rabbitmq.routingkey}")
    private String routingKey;


    /**
     * Classe helper para acessar e enviar mensagens para RabbitMQ de forma síncrona;
     * @method rabbitTemplate possui recebe os parâmetro: routingKey(nome da file) e message(mensagem a ser enviada).
     * @param
     */
    public void produceMenssage(String msg){
        rabbitTemplate.convertAndSend(exchange, routingKey, msg);
        System.out.println("Send msg = " + msg);
    }

}
