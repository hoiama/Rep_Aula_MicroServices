package br.com.hoiama.curriculos.controller;

import br.com.hoiama.curriculos.model.entity.Curso;
import javax.validation.Valid;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerDashboardPost {
	
		/**
		 * Gravar Curso no banco de dados
		 * @param nomeCurso
		 * @param instituicao
		 * @param ano
		 * @return
		 */
		@CacheEvict(value="curriculo", allEntries=true)
		@RequestMapping(value="/salvar-curso", method= RequestMethod.POST)
		public String salvarCurso(@Valid Curso curso, BindingResult result) {
			
			if(result.hasErrors()){
				System.out.println( + curso.getIdFormacao() 
									+ curso.getNomeCurso() 
									+ curso.getNivel() + result.getAllErrors());
				
				return "forward:/dashboard-formulario";
			};
			
			System.out.println(+ curso.getIdFormacao() + curso.getNomeCurso() + curso.getNivel());
			return "MainStatic";
		}
}
