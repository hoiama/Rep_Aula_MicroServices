package br.com.hoiama.curriculos.testes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import br.com.hoiama.curriculos.model.entity.Curriculo;
import br.com.hoiama.curriculos.model.entity.Curso;
import br.com.hoiama.curriculos.model.entity.Experiencia;
import br.com.hoiama.curriculos.model.entity.Formacao;
import br.com.hoiama.curriculos.model.entity.Resumo;

@Component
public class TesteCurriculo {
	Curriculo curriculo = new Curriculo();

	public Curriculo getCurriculo() {
		curriculo.setExperiencia(getExperiencicas());
		curriculo.setFormacao(getListaFormacoes());
		curriculo.setCurso(getCursos());
		return curriculo;
	}

	
	public List<Resumo> getResumo() {
		Resumo resumo = new Resumo();
		List<Resumo> resumos = new ArrayList<Resumo>();
		
		resumo.setProfissao("Desenvolvedor Java | Júnior - Pleno");
		resumo.setResumo("Cinco anos de experiência em infraestrutura e sistemas, atualmente"
				+ " especializando em programação de sistemas Web focado na linguagem Java."
				+ " Voltado para computação em nuvem utilizando ambiente Linux e projetos "
				+ " open source.");
		resumo.setObjetivo("Busco oportunidade na área de Desenvolvimento Web com foco na"
				+ " linguagem Java.");
		resumos.add(resumo);
		
		return resumos;
	}
	
	
	public List<Formacao> getListaFormacoes() {
		Formacao formacao1 = new Formacao();
		Formacao formacao2 = new Formacao();
		Formacao formacao3 = new Formacao();
		Formacao formacao4 = new Formacao();
		List<Formacao> formacoes = new ArrayList<Formacao>();

		formacao1.setNomeCurso("Pós-Graduação em Arquitetura de Cloud Computing");
		formacao1.setInstituicao("Universidade Estácio de sá");
		formacao1.setAno(2018);

		formacao2.setNomeCurso("Bacharelado em Sistema de informação");
		formacao2.setInstituicao("Universidade Estácio de sá");
		formacao2.setAno(2018);

		formacao3.setNomeCurso("Técnico em eletrônica / Informática");
		formacao3.setInstituicao("CEITE");
		formacao3.setAno(2010);

		formacao4.setNomeCurso("Técnico em eletrotécnica");
		formacao4.setInstituicao("SENAI");
		formacao4.setAno(2009);

		formacoes.add(formacao1);
		formacoes.add(formacao2);
		formacoes.add(formacao3);
		formacoes.add(formacao4);
		
		return formacoes;
	}

	
	public List<Experiencia> getExperiencicas() {
		Experiencia experiencia1 = new Experiencia();
		Experiencia experiencia2 = new Experiencia();
		Experiencia experiencia3 = new Experiencia();
		Experiencia experiencia4 = new Experiencia();
		List<Experiencia> experiencias = new ArrayList<Experiencia>();

		experiencia1.setNomeEmpresa("Força Aérea Brasileira");
		experiencia1.setExperiencia("Sistemas e plataformas CMS, Sistemas básicos em Java e\n"
				+ "PHP, puppet, servidores, redes, help desk remoto, manutenção e\n"
				+ "configuração de linux, montagem e configuração de servidores,\n"
				+ "switch e roteadores, cabeamento estruturado, elaboração de\n"
				+ "relatórios, documentos e auditoria de sistemas");

		experiencia2.setNomeEmpresa("Analista de TI");
		experiencia2.setExperiencia("Sistemas e plataformas CMS, Sistemas básicos em Java e\n"
				+ "	PHP, puppet, servidores, redes, help desk remoto, manutenção e\n"
				+ "	configuração de linux, montagem e configuração de servidores,\n"
				+ "	switch e roteadores, cabeamento estruturado, elaboração de\n"
				+ "	relatórios, documentos e auditoria de sistemas.");

		experiencia3.setNomeEmpresa("Analista de TI");
		experiencia3.setExperiencia("Sistemas e plataformas CMS, Sistemas básicos em Java e\n"
				+ "	PHP, puppet, servidores, redes, help desk remoto, manutenção e\n"
				+ "	configuração de linux, montagem e configuração de servidores,\n"
				+ "	switch e roteadores, cabeamento estruturado, elaboração de\n"
				+ "	relatórios, documentos e auditoria de sistemas.");

		experiencia4.setNomeEmpresa("Analista de TI");
		experiencia4.setExperiencia("Sistemas e plataformas CMS, Sistemas básicos em Java e\n"
				+ "	PHP, puppet, servidores, redes, help desk remoto, manutenção e\n"
				+ "	configuração de linux, montagem e configuração de servidores,\n"
				+ "	switch e roteadores, cabeamento estruturado, elaboração de\n"
				+ "	relatórios, documentos e auditoria de sistemas.");

		experiencias.add(experiencia1);
		experiencias.add(experiencia2);
		experiencias.add(experiencia3);
		experiencias.add(experiencia4);
		
		return experiencias;
	}

	
	public List<Curso> getCursos(){
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Curso curso3 = new Curso();
		Curso curso4 = new Curso();
		Curso curso5 = new Curso();
		Curso curso6 = new Curso();
		List<Curso> cursos = new ArrayList<Curso>();
		
		curso1.setNomeCurso("Java");
		curso1.setNivel(3);
		
		curso2.setNomeCurso("Java");
		curso2.setNivel(3);
		
		curso3.setNomeCurso("Java");
		curso3.setNivel(3);
		
		curso4.setNomeCurso("Java");
		curso4.setNivel(3);
		
		curso5.setNomeCurso("Java");
		curso5.setNivel(3);
		
		curso6.setNomeCurso("Java");
		curso6.setNivel(3);
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		
		return cursos;
	}
}
