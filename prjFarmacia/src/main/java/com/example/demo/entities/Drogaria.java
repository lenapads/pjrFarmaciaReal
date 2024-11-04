package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Drogaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotNull
	@Size(min=3, message="mínimo de 3 caracteres")
    private String nome;
	
	@NotNull
	@Size(min=3, message="mínimo de 8 caracteres")
    private String cnpj;
	
	public Drogaria() {
		
	}
	

	public Drogaria(Long id, @NotNull @Size(min = 3, message = "mínimo de 3 caracteres") String nome,
			@NotNull @Size(min = 8, message = "mínimo de 8 caracteres") String senha,
			@NotNull @Email(message = "Informe o email") String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
    //metodos getts e setts
    
    
}
