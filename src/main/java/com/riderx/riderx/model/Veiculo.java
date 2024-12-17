package com.riderx.riderx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_veiculos")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo modelo é obrigatorio")
	@Size(min = 2, max = 60, message = "O atributo modelo deve conter no minimo 2 e no maximo 60 caracteres")
	private String modelo;

	@NotBlank(message = "O atributo cor é obrigatorio")
	@Size(min = 2, max = 60, message = "O atributo cor deve conter no minimo 2 e no maximo 60 caracteres")
	private String cor;
	
	@NotNull(message = "O atributo ano é obrigatorio")
	@Pattern(regexp = "^[0-9]{4}$", message = "O ano deve ser um valor válido com 4 números.")
    private String ano;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	

}
