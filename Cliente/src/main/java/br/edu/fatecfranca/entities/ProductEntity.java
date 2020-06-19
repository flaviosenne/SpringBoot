package br.edu.fatecfranca.entities;

public class ProductEntity {
	private Long id;
	private Long is;
	private String descricao;
	private float preco;
	private int qtd;
	private String nome;
	
	
	public ProductEntity() {
		
	}
	public ProductEntity(Long id, Long is, String descricao, float preco, int qtd, String nome) {
		super();
		this.id = id;
		this.is = is;
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
	public Long getIs() {
		return is;
	}
	public void setIs(Long is) {
		this.is = is;
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
		return "ProductEntity [id=" + id + ", is=" + is + ", descricao=" + descricao + ", preco=" + preco + ", qtd="
				+ qtd + ", nome=" + nome + "]";
	}
	
	
	
}
