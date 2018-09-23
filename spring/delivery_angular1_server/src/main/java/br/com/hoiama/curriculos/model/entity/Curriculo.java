package br.com.hoiama.curriculos.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "curriculo")
public class Curriculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(max=25)
	@Column(name = "nome", nullable = false)
	private String nome;

	@OneToMany
	private List<Resumo> resumo;

	@OneToMany
	private List<Curso> curso;

	@OneToMany
	private List<Experiencia> experiencia;

	@OneToMany
	private List<Formacao> formacao;

	private String arquivo;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Resumo> getResumo() {
		return resumo;
	}

	public void setResumo(List<Resumo> resumo) {
		this.resumo = resumo;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	public List<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public List<Formacao> getFormacao() {
		return formacao;
	}

	public void setFormacao(List<Formacao> formacao) {
		this.formacao = formacao;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

}
