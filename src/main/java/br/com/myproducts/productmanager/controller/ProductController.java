package br.com.myproducts.productmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myproducts.productmanager.model.Product;
import br.com.myproducts.productmanager.repositorio.ProdutoRepositorio;

//permite usarmos @GetMapping, @PostMapping, dentre outros para podermos modificar o conteúdo do banco de dados de maneira fácil.
@RestController
@RequestMapping("/produtos") //mapeia qual caminho precisa colocar pra acessar os métodos
public class ProductController {
	
	//permite criar e fornecer uma instância de ProdutoRepositorio sempre que a classe for instanciada
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	//se não informado o caminho, o "/produtos" vai chamar esse método.
	@GetMapping//define como requisição http get(só retorna informações)
	public List<Product> getProdutos() {
		
		//método do jpa para puxar todos os registros do DB.
		return produtoRepositorio.findAll();
		
	}
	
	@PostMapping//define como uma requisição http post(envia ou modifica dados)
	public void incluirProduto(@RequestBody Product produto) {//indica que o parâmetro deve ser vinculado ao body
		
		//faz a adição do produto no banco de dados
		produtoRepositorio.save(produto);
		
	}
	
	@PutMapping//define como uma requisição http put(modifica dados já existente)
	public void alterarProduto(@RequestBody Product produto) {
		
		//método do jpa para adicionar registros no DB.
		produtoRepositorio.save(produto);
		
	}
	
	@DeleteMapping("/{id}")//define como uma requisição http delete(deleta dados)
	public void deletarProduto(@PathVariable Long id) {
		
		//método do jpa para fazer exclusões no DB pelo id.
		produtoRepositorio.deleteById(id);
		
	}
	
	@GetMapping("/{id}")//obter produto pelo id(as chaves tornam o valor uma variável pra poder ser usada no método)
	public Optional<Product> obterProduto(@PathVariable Long id) {
		
		//método do jpa para fazer buscas no DB pelo id.
		return produtoRepositorio.findById(id);
		
	}
	
}
