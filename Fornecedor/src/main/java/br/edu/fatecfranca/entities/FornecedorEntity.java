package br.edu.fatecfranca.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// esta classe relaciona com o documento fornecedor no MongoDB
@Document(collection="fornecedor")
public class FornecedorEntity {
	
	// indica que este campo id será criado automaticamente quando da criação de um framework
	@Id
	private String id;
	private String nome;
	private String cnpj;
	private float avaliacao;
	private int inscricoEstadual;
	
	
	public FornecedorEntity() {
		
	}
	
	
	
	public FornecedorEntity(String id, String nome, String cnpj, float avaliacao, int inscricoEstadual) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.avaliacao = avaliacao;
		this.inscricoEstadual = inscricoEstadual;
	}



	public String getId() {
		return id;
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public float getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getInscricoEstadual() {
		return inscricoEstadual;
	}
	public void setInscricoEstadual(int inscricoEstadual) {
		this.inscricoEstadual = inscricoEstadual;
	}

	@Override
	public String toString() {
		return "FornecedorEntity \n id: " + id + ", \n nome: " + nome + ",\n cnpj: " + cnpj + ", \n avaliacao: " + avaliacao
				+ ", \n inscricoEstadual: " + inscricoEstadual;
	}
	
	
}
