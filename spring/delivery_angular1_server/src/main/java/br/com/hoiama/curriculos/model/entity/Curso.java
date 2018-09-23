package br.com.hoiama.curriculos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFormacao;

	@NotNull
	@Column(name = "curso")
	@Size(min=2, message="O tamando deve ser maior que 2")
	private String nomeCurso;

	@NotNull
	@Column(name = "nivel")
	private int nivel;
	

	public int getIdFormacao() {
		return idFormacao;
	}

	public void setIdFormacao(int idFormacao) {
		this.idFormacao = idFormacao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	


}
