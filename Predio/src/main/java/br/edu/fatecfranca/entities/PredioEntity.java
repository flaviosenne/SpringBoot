package br.edu.fatecfranca.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="predio")
public class PredioEntity {
	
	@Id
	private String id;
	private String nome;
	private int qtdeAndares;
	private int qtdeeAptos;
	private String endereco;
	public String getId() {
		return id;
	}
	
	
	public PredioEntity() {
		
	}
	
	public PredioEntity(String id, String nome, int qtdeAndares, int qtdeeAptos, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdeAndares = qtdeAndares;
		this.qtdeeAptos = qtdeeAptos;
		this.endereco = endereco;
	}



	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdeAndares() {
		return qtdeAndares;
	}
	public void setQtdeAndares(int qtdeAndares) {
		this.qtdeAndares = qtdeAndares;
	}
	public int getQtdeeAptos() {
		return qtdeeAptos;
	}
	public void setQtdeeAptos(int qtdeeAptos) {
		this.qtdeeAptos = qtdeeAptos;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
