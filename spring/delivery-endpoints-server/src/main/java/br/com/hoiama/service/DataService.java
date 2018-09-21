package br.com.hoiama.service;

import br.com.hoiama.Repository.AlunoRepository;
import br.com.hoiama.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class DataService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAluno(){
        System.out.println("Serviço do aluno");
        return alunoRepository.findAll();
    }

    public void postAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

}
