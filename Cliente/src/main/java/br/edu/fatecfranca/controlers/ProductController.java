package br.edu.fatecfranca.controlers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.ProductEntity;
import br.edu.fatecfranca.repositories.ProductRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductRepository injecao;
	
	@GetMapping
	public List<ProductEntity> getProducts(){
		return injecao.findAll();
	}
	
	@GetMapping("/{product}")
	public Optional<ProductEntity> getProduct(@PathVariable Long product){
		return injecao.findById(product);
	}
	
	@PostMapping
	public ProductEntity createProduct(@RequestBody ProductEntity product) {
		return injecao.save(product);
	}
	
	@PutMapping("/{id}")
	public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity product) {
		return injecao.save(product);		
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		injecao.deleteById(id);
		return id + "Deleted";
	}
	
}
