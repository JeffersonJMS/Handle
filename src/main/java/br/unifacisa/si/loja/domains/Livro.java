package br.unifacisa.si.loja.domains;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Livro {
	
	@Id
	private String id;
	@NotBlank(message="{name.not.blank}")
	private String nome;
	@Positive(message="{quantTotal.positive}")
	private int quantTotal;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantTotal() {
		return quantTotal;
	}

	public void setQuantTotal(int quantTotal) {
		this.quantTotal = quantTotal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
