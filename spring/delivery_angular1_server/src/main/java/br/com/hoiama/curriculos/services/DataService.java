package br.com.hoiama.curriculos.services;

import br.com.hoiama.curriculos.repository.AlunoRepository;
import br.com.hoiama.curriculos.model.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public List<Aluno> findAlunoByInstituicao(String instituicao){
        return alunoRepository.findAll();
    }


    public void postAluno(String nome, String instituicao) {
        Aluno aluno = new Aluno();
        aluno.setInstituição(instituicao);
        aluno.setNome(nome);
        alunoRepository.save(aluno);
    }

}
