package br.com.myproducts.productmanager.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myproducts.productmanager.model.Product;

//Permite a conexão com o banco de dados(sem nenhum comando SQL)
public interface ProdutoRepositorio extends JpaRepository<Product, Long>{
	
}
