package br.unifacisa.si.loja.domains;

import javax.validation.Valid;

//import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pessoa {

	@Id
	private String id;
	@Valid
	private Credencial credencial;
	@Valid
	private Endereco endereco;

	public Credencial getCredencial() {
		return credencial;
	}

	public void setCredencial(Credencial credencial) {
		this.credencial = credencial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pessoa [credencial=" + credencial + ", endereco=" + endereco + "]";
	}
	
	
	
}
