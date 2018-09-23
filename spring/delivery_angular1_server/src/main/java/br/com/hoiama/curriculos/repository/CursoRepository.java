package br.com.hoiama.curriculos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.hoiama.curriculos.model.entity.Formacao;

@Repository
public interface CursoRepository extends CrudRepository<Formacao, Long>{

	
}
