package br.com.hoiama.service;

import br.com.hoiama.Repository.AlunoRepository;
import br.com.hoiama.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class DataService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAllAlunos(){
        System.out.println("Serviço do aluno");
        return alunoRepository.findAll();
    }


    public Optional findByIdAluno(Long idAluno){
        return alunoRepository.findById(idAluno);
    }


    public void postAluno(String nome, String instituicao) {
        Aluno aluno = new Aluno();
        aluno.setInstituição(instituicao);
        aluno.setNome(nome);
        alunoRepository.save(aluno);
    }

}
