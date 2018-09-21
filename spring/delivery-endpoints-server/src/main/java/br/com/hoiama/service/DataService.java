package br.com.hoiama.service;

import br.com.hoiama.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;

public class DataService {

    @Autowired
    Aluno aluno;

    public Aluno getAluno(){
        System.out.println("Serviço do aluno");
        return aluno;
    }
}
