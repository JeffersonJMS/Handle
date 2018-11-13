package br.unifacisa.si.loja.domains;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class Endereco {

	@NotBlank(message="{rua.not.blank}")
	private String rua;
	@Positive(message="{numero.positive}")
	private int numero;
	private String complemento;
	@Positive(message="{cep.positivo}")
	private int cep;
	private String referencia;
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep
				+ ", referencia=" + referencia + "]";
	}
	
	
	
}
