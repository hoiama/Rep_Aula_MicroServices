package br.com.hoiama.estudonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class EstudonlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudonlineApplication.class, args);
    }

    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String getIndex(){
        return "templates/index.html";
    }
}
