package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // informa q esta classe é uma entidade no BD
@Table(name ="cliente") // informa que esta classe está  mapeda na tabela cliente
public class ClientEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	private float nota;
	
	
	public ClientEntity() {
		
	}
	
	public ClientEntity(Long id, String nome, String endereco, String rg, Integer idade, float nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
		this.idade = idade;
		this.nota = nota;
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
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "ClientEntity [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", rg=" + rg + ", idade="
				+ idade + ", nota=" + nota + "]";
	}
	
	
}
