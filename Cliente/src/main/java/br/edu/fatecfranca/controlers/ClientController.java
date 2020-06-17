package br.edu.fatecfranca.controlers;

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

import br.edu.fatecfranca.entities.ClientEntity;
import br.edu.fatecfranca.repositories.ClienteRepository;


@RestController
@RequestMapping("api/cliente")
public class ClientController {
	
	@Autowired
	private ClienteRepository injecao;
	
	@PostMapping
	public ClientEntity addClient(@RequestBody ClientEntity client) {
		return injecao.save(client);
	}
	
	@GetMapping
	public List<ClientEntity> getClient() {
		return injecao.findAll();
	}
	
	@PutMapping
	public ClientEntity updateClient(@RequestBody ClientEntity client) {
		return injecao.save(client);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteClient(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
}
