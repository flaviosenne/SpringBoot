package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	@Column(name="preco")
	private float preco;
	@Column(name="qtd")
	private int qtd;
	@Column(name="nome")
	private String nome;
	
	
	public ProductEntity() {
		
	}
	public ProductEntity(Long id, String descricao, float preco, int qtd, String nome) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtd = qtd;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", qtd="
				+ qtd + ", nome=" + nome + "]";
	}
	
	
	
}
