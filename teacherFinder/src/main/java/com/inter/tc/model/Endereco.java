package com.inter.tc.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

//@Embeddable
public class Endereco implements Serializable {		

	private static final long serialVersionUID = 1L;

	private String logradouro;
	
	@NotBlank(message = "Número é Obrigatório, Se não houver, digite SN")
	private String numero;
	
	private String complemento;
	
	@NotBlank(message = "CEP é Obrigatório")
	private String cep;
	
//	@ManyToOne
//	@JoinColumn(name = "codigo_cidade")
	private Cidade cidade;
	
//	@Transient
	private Estado estado;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getNomeCidadeSiglaEstado() {
		if (this.cidade != null) {
			return this.cidade.getNome() + "/" + this.cidade.getEstado().getSigla();
		}
		
		return null;
	}
	
}
