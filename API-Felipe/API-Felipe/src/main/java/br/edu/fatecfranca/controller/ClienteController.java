package br.edu.fatecfranca.controller;

import java.util.List;

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

import br.edu.fatecfranca.entities.ClienteEntity;
import br.edu.fatecfranca.repositories.ClienteRepository;

//@CrossOrigin -> configura quem pode consumir a API
//(origins = "*") -> a requisição de qualquer site - IP
//segurança da API -> CORS (Cross-origin resource sharing)
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository injecao;
	
	@PostMapping
	public ClienteEntity addCliente(@RequestBody ClienteEntity cliente) {
		return injecao.save(cliente);
	}
	
	@GetMapping
	public List<ClienteEntity> getClientes(){
		return injecao.findAll();
	}

	@DeleteMapping("/{id}")
	public boolean deleteCliente(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public ClienteEntity updateCliente(@RequestBody ClienteEntity cliente) {
		return injecao.save(cliente);
	}


}
