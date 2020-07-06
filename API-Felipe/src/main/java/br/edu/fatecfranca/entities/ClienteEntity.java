package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // informa que esta classe é uma entidade de banco de dados
@Table(name="cliente") // informa que esta classe está mapeada na tabela cliente
public class ClienteEntity {

	@Id // informa que esta variável representa uma chave primária
	@GeneratedValue(strategy=GenerationType.AUTO) // informa que é auto-incrmento
	private Long id;
	@Column(name="nome") // informa que esta variável representa a coluna nome
	private String nome;
	@Column(name="endereco") // informa que esta variável representa a coluna endereço
	private String endereco;
	@Column(name="rg") // informa que esta variável representa a coluna rg
	private String rg;
	@Column(name="idade") // informa que esta variável representa a coluna idade
	private Integer idade;
	@Column(name="nota") // informa que esta variável representa a coluna nota
	private Float nota;
	
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
	
	
}
