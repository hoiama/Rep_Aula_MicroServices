package br.com.swagger.main;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/")
public class Controller2 {

    @PostMapping("teste2")
    public String custom() {
        return "custom";
    }
}