package br.com.hoiama.curriculos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idExperiencia;
	
	@NotNull
	@Size(max=20)
	@Column(name="nome_empresa")
	private String nomeEmpresa;
	
	@Size(max=20)
	@Column(name="experiencia")
	private String experiencia;
	
	
	public long getIdExperiencia() {
		return idExperiencia;
	}

	public void setIdExperiencia(long idExperiencia) {
		this.idExperiencia = idExperiencia;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
}
