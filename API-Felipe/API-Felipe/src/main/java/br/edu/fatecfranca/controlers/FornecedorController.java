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

import br.edu.fatecfranca.entities.Fornecedor;
import br.edu.fatecfranca.repositories.FornecedorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {

	@Autowired
	FornecedorRepository injecao;
	
	@GetMapping
	public List<Fornecedor> getFornecedores(){
		return injecao.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Fornecedor> getFornecedor(@PathVariable Long id){
		return injecao.findById(id);
	}
	
	@PostMapping
	public Fornecedor createForencedor(@RequestBody Fornecedor fornecedor) {
		return injecao.save(fornecedor);
	}
	
	@PutMapping("/{id}")
	public Fornecedor updateFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
		return injecao.save(fornecedor);		
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteFornecedor(@PathVariable Long id) {
		injecao.deleteById(id);
		return id + "Deleted";
	}
	
}
