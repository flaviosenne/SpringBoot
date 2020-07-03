package br.edu.fatecfranca.controlers;

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


import br.edu.fatecfranca.entities.VendasEntity;
import br.edu.fatecfranca.repositories.VendaRepository;

//@CrossOrigin -> configura quem pode consumir a API
//(origins = "*") -> a requisição de qualquer site - IP
//segurança da API -> CORS (Cross-origin resource sharing)
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/venda")
public class VendaController {

	@Autowired
	private VendaRepository injecao;
	
	@PostMapping
	public VendasEntity addVenda(@RequestBody VendasEntity venda) {
		return injecao.save(venda);
	}
	
	@GetMapping
	public List<VendasEntity> getVendas(){
		return injecao.findAll();
	}

	@DeleteMapping("/{id}")
	public boolean deleteVenda(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public VendasEntity updateVenda(@RequestBody VendasEntity venda) {
		return injecao.save(venda);
	}


}