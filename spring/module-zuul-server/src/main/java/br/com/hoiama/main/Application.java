package br.com.hoiama.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
