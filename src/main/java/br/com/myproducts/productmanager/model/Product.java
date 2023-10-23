package br.com.myproducts.productmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//marca uma classe como uma entidade persistente e pode ser armazenado no banco de dados.(JPA)
@Entity
public class Product {

	//informa o identificador
	@Id
	private Long id;
	private String nome;
	private int preco;
	private int quantidade;
	
	//constructors
	public Product() {}
	public Product(String nome, int preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//getters and setters methods
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
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
