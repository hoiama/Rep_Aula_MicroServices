package br.com.hoiama.controller;

import br.com.hoiama.entity.Aluno;
import br.com.hoiama.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DashboardAdminController {

    @Autowired
    DataService service;

    @ResponseBody
    @GetMapping("/get")
    public List<Aluno> getAlunos(){
        System.out.println("getAlunos");
        return service.getAluno();
    }

    @ResponseBody
    @PostMapping("/post")
    public void postAlunos(
            @RequestParam ("nome") String nome,
            @RequestParam ("instituicao") String instituicao){

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setInstituição(instituicao);

        service.postAluno(aluno);
        System.out.println("postAlunos :: " + nome);

    }
}
