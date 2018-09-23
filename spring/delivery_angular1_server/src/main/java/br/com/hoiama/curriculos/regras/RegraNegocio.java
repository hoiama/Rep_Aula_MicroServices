package br.com.hoiama.curriculos.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.hoiama.curriculos.model.entity.Curriculo;
import br.com.hoiama.curriculos.testes.TesteCurriculo;

@Component
public class RegraNegocio {
	
	@Autowired
	private TesteCurriculo curriculo;
	
	
	public Curriculo getCurriculo() {
		return curriculo.getCurriculo();
	}

	
	
}
