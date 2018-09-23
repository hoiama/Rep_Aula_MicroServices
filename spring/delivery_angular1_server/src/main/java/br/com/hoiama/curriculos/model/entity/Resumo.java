package br.com.hoiama.curriculos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Resumo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResumo;
	
	@NotNull
	@Column(name="resumo")
	private String resumo;

	@NotNull
	@Column(name="profissao")
	private String profissao;
	
	@NotNull
	@Column(name = "objetivo")
	private String objetivo;

	
	public int getIdResumo() {
		return idResumo;
	}

	public void setIdResumo(int idResumo) {
		this.idResumo = idResumo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	

}
