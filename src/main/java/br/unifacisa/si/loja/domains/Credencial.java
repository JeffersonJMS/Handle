package br.unifacisa.si.loja.domains;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.br.CPF;

public class Credencial {

	@NotBlank(message= "{name.not.blank}")
	private String nome;
	@Positive(message="{idade.positive}")
	private byte idade;
	@CPF(message="{cpf.cpf}")
	private String cpf;
	@NotBlank(message="{titulo.not.blank}")
	private String titulo;
	@NotBlank(message="{reservista.not.blank}")
	private String reservista;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	@Override
	public String toString() {
		return "Credencial [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", titulo=" + titulo + ", reservista="
				+ reservista + "]";
	}
}
