package br.com.hoiama.curriculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.hoiama.curriculos.regras.RegraNegocio;

@RestController
@RequestMapping ("/api")
public class ControllerDashBoardDelete {

	@Autowired
	RegraNegocio regras;
	
	@RequestMapping(value="/curso/{id}", method=RequestMethod.DELETE)
	public void excluirCurso(@PathVariable("id") Integer id) {
//		retornar o recurso que foi alterado
		System.out.println("Excluindo curso de id : " + id);
	}

}
