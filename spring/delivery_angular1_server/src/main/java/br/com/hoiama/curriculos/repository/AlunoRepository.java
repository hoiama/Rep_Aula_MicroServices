package br.com.hoiama.curriculos.repository;

import br.com.hoiama.curriculos.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    //List<Aluno> findAlunoByIdAlunoOrderByNome(Long aLong);


   // @Query("select a from Aluno a where a.instituição like ?1")
   // List<Aluno> findAlunosByInstituicao(String instituicao);

}
