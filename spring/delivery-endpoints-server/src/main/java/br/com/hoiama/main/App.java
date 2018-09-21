package br.com.hoiama.main;

import br.com.hoiama.service.DataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackageClasses = {DataService.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

