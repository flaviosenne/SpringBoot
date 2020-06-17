package br.edu.fatecfranca.controllers;

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

import br.edu.fatecfranca.entities.PredioEntity;
import br.edu.fatecfranca.repositories.PredioRepository;

@RestController
@RequestMapping("api/predio")
public class PredioController {
	@Autowired
	PredioRepository injecao;
	
	
	@PostMapping
	public PredioEntity addPredio(@RequestBody PredioEntity predio) {
		return injecao.save(predio);
	}
	
	@GetMapping
	public List<PredioEntity> getPredio(){
		
		return injecao.findAll();
	}
	
	
	@DeleteMapping("/{id}")
	public boolean removePredio(@PathVariable String id) {
		
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public PredioEntity updatePredio(@RequestBody PredioEntity predio) {
		// no metodo put o mongoDB vê se o ID foi passado como parametro e busca se existe já criado, caso não ele cria, caso sim ele atualiza 
		
		return injecao.save(predio);
	}
	
}
