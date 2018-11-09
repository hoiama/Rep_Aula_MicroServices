package br.com.hoiama.controller;

import br.com.hoiama.entity.Aluno;
import br.com.hoiama.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class DashboardAdminController {

    @Autowired
    private DataService service;


    @ResponseBody
    @GetMapping("/findAll")
    public List<Aluno> getAlunos(){
        System.out.println("getAlunos");
        return service.findAllAlunos();
    }


    @ResponseBody
    @GetMapping ("/findById")
    public Optional<Aluno> findAlunoById(
            @RequestParam ("idAluno") Long idAluno){

        return service.findByIdAluno(idAluno);
    }


    @ResponseBody
    @GetMapping("/findByInstituicao")
    public List<Aluno> findAlunoByInstituicao(
            @RequestParam("instituicao") String instituicao){

        return service.findAlunoByInstituicao(instituicao);
    }


    @ResponseBody
    @PostMapping("/post")
    public String postAlunos(
            @RequestParam ("nome") String nome,
            @RequestParam ("instituicao") String instituicao){

        service.postAluno(nome, instituicao);
        return "postAlunos :: " + nome;
    }
}
