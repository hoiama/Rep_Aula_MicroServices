package br.com.hoiama.Repository;

import br.com.hoiama.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findAlunoByIdAlunoOrderByNome(Long aLong);


}
