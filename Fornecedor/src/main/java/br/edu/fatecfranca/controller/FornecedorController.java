package br.edu.fatecfranca.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.FornecedorEntity;
import br.edu.fatecfranca.repositories.FornecedorRepository;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {
	
	// injeção de dependencia
	// execução de métodos sem instanciar um objeto
	// objeto injecao não foi instanciado, foi apenas declarado como o tipo de uma classe interface
	@Autowired
	FornecedorRepository injecao;
	
	
	@PostMapping
	public FornecedorEntity addFornecedor(@RequestBody FornecedorEntity fornecedorEntity) {
		return injecao.save(fornecedorEntity);
	}
	
	@GetMapping
	public List<FornecedorEntity> getFornecedores(){
		
		return injecao.findAll();
	}
	
	
	@DeleteMapping("/{id}")
	public boolean removeFornecedor(@PathVariable String id) {
		
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public String updateFornecedor(@RequestBody FornecedorEntity fornecedor) {
		// no metodo put o mongoDB vê se o ID foi passado como parametro e busca se existe já criado, caso não ele cria, caso sim ele atualiza 
		String id = fornecedor.getId();
		
		boolean actual = injecao.existsById(id);
		
		if(actual) {
			injecao.save(fornecedor);
			return fornecedor.messageSucess();
		}
		
		return fornecedor.messageNotFound();
		
	}
	
}
