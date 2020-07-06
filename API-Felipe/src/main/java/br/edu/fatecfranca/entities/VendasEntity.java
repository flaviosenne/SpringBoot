package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendas")
public class VendasEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	

	@Column(name = "num_venda")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numVenda;
	@Column(name = "cliente")
	private String cliente;
	@Column(name = "produto")
	private String produto;
	
	public VendasEntity() {
		
	}
	public VendasEntity(long id, int numVenda, String cliente, String produto) {
		super();
		this.id = id;
		this.numVenda = numVenda;
		this.cliente = cliente;
		this.produto = produto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumVenda() {
		return numVenda;
	}
	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
}
