package br.edu.fatecfranca.entities;

public class EstadioEntity {
	private int id;
	private String nome;
	private int capacidade;
	private String cidade;
	private String dono;
	private float nota;
	
	
	public EstadioEntity() {
		
	}
	
	public EstadioEntity(int id, String nome, int capacidade, String cidade, String dono, float nota) {
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.cidade = cidade;
		this.dono = dono;
		this.nota = nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "EstadioEntity \n id=" + this.id + ", \nnome=" + this.nome + ", \ncapacidade=" + this.capacidade + ", \ncidade=" + this.cidade
				+ ", \ndono=" + this.dono + ", \nnota=" + this.nota;
	}
}
