package br.com.hoiama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(value = "/aluno")
public class Main {

    @RequestMapping("/dados")
    public void getAlunos(){

    }
}
