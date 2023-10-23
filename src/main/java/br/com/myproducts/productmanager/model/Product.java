package br.com.myproducts.productmanager.model;

import java.util.Date;

public class Product {

	//product infos
	private String nome;
	private Date data_registro;
	private int preco;
	private int quantidade;
	
	//constructors
	public Product() {}
	public Product(String nome, int preco, Date data_registro, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.data_registro = data_registro;
		this.quantidade = quantidade;
	}
	
	//getters and setters methods
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
	public Date getData_registro() {
		return data_registro;
	}
	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
