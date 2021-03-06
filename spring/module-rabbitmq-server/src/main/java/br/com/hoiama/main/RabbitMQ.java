package br.com.hoiama.main;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@EnableRabbit
@Controller
@SpringBootApplication
public class RabbitMQ {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQ.class, args);
    }

    @Autowired
    Producer producer;

    @RequestMapping("/send")
    public String sendMessage(@RequestParam("msg") String msg){
        System.out.println("Mensagem enviada: "+msg);
        for(int i =0; i<25;i++){
            producer.produce(msg);
        }
        return "Successfully Msg Sent";
    }
}
