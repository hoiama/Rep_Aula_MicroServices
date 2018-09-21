package br.com.hoiama.service;

import br.com.hoiama.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {



    public void getAluno(){
        System.out.println("Serviço do aluno");
    }
}
