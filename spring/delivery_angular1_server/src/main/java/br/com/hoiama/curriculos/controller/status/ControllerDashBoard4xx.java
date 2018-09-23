package br.com.hoiama.curriculos.controller.status;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.hoiama.curriculos.model.entity.Curso;
import br.com.hoiama.curriculos.regras.RegraNegocio;

@RestController
@RequestMapping ("/api")
public class ControllerDashBoard4xx {

	@Autowired
	RegraNegocio regras;
	
	@RequestMapping(value="/curso/not-found", method=RequestMethod.GET, produces="application/json")
	public Curso error404(HttpServlet respose) {
		throw new ResourceNotFound();
	}
}
