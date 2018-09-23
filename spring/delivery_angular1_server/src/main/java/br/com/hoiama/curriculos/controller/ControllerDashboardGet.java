package br.com.hoiama.curriculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.hoiama.curriculos.model.entity.Curriculo;
import br.com.hoiama.curriculos.model.entity.Curso;
import br.com.hoiama.curriculos.regras.RegraNegocio;

@Controller
public class ControllerDashboardGet {
	
	@Autowired
	RegraNegocio regras;
	
	
//	HTTP
	
	/**
	 * GET : Página do curriculo Real do usuário
	 * @return página do curriculo em sí
	 */
	@Cacheable(value="curriculo")
	@RequestMapping("/dashboard")
	public String getDashboard(Model model) {
		Curriculo curriculoPronto = regras.getCurriculo();
		model.addAttribute("curriculo", curriculoPronto);
		return "Dashboard";
	}

	
	/**
	 * GET : Formulário de preenchimento do currículo
	 * @return página de formulário do currículo
	 */
	@Cacheable(value="formulario")
	@RequestMapping("/dashboard-formulario")
	public String getDashboardFormulario(Model model) {
		model.addAttribute("curriculo", regras.getCurriculo());
		return "DashboardFormulario";
	}
	
	
	/**
	 * GET : Painel de Administração dos curriculos cadastrados
	 * @return página do painel de administração do curriculo
	 */
	@RequestMapping("/admin")
	public String getDashboardAdmin() {
		return "DashboardAdmin";
	}
	
	
	/**
	 * GET : Painel de Administração dos curriculos cadastrados
	 * @return página do painel de administração do curriculo
	 */
	@RequestMapping("/main-static")
	public String getDashboardMainStatic() {
		return "MainStatic";
	}
	
	/**
	 * GET : Painel de Administração dos curriculos cadastrados
	 * @return página do painel de administração do curriculo
	 */
	@RequestMapping("/dashboard-rest")
	public String getDashboardREST() {
		return "DashboardREST";
	}
	
	
//	REST
	
	@RequestMapping(value="/cursos/{id}", method=RequestMethod.GET, produces="application/json")
	public List<Curso> getCursos(@PathVariable("id") Integer id) {
		System.out.println("Retorando lista de cursos: " + id);
		return regras.getCurriculo().getCurso();
	}
	
	
	@RequestMapping(value="/curriculo/{id}", method=RequestMethod.GET, produces="application/json")
	public Curriculo getCurriculo(@PathVariable("id") Integer id) {
		System.out.println(id);
		return regras.getCurriculo();
	}
}

