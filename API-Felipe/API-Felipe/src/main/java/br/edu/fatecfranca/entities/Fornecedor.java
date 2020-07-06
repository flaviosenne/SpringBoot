package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "razao_social")
	private String razao;
	@Column(name= "nome_fantasia")
	private String fantasia;
	@Column(name="cnpj")
	private String cnpj;
	@Column(name="endereco")
	private String endereco;
	@Column(name="email")
	private String email;
	@Column(name="telefone")
	private String telefone;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(Long id, String razao, String fantasia, String cnpj, String endereco, String email,
			String telefone) {
		super();
		this.id = id;
		this.razao = razao;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", razao=" + razao + ", fantasia=" + fantasia + ", cnpj=" + cnpj + ", endereco="
				+ endereco + ", email=" + email + ", telefone=" + telefone + "]";
	}
}
