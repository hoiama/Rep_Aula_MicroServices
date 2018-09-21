package br.com.hoiama.controller;

import br.com.hoiama.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(value = "/aluno")
public class DashboardAdminController {

    @Autowired
    DataService service;

    @GetMapping("/get")
    @ResponseBody
    public String getAlunos(){
        service.getAluno();
        return "Chamada do endPoint";
    }
}
