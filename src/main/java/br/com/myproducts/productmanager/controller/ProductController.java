package br.com.myproducts.productmanager.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myproducts.productmanager.model.Product;

//permite usarmos @GetMapping, @PostMapping, dentre outros para podermos modificar o conteúdo do banco de dados de maneira fácil.
@RestController
@RequestMapping("/produtos") //mapeia qual caminho precisa colocar pra acessar os métodos
public class ProductController {
	
	//se não informado o caminho, o "/produtos" vai chamar esse método.
	@GetMapping//define como requisição http get(só retorna informações)
	public Product getProdutos() {
		
		Product produto = new Product("Notebook", 5000, new Date(), 50);
		
		return produto;
		
	}
	
}
