package br.edu.fatecfranca.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;



import br.edu.fatecfranca.entities.EstadioEntity;


@RestController // indica que a classe responde por requisisção REST
@RequestMapping("/api/estadio") // indica que a rota é /api/jogo

public class EstadioController {
	ArrayList<EstadioEntity> estadios = new ArrayList<EstadioEntity>();

	@PostMapping
	public EstadioEntity addJogo(@RequestBody EstadioEntity estadio) {
		this.estadios.add(estadio);
		return estadio;
	}
	
	
	@GetMapping
	public ArrayList<EstadioEntity> getEstadio(){
		return this.estadios;
	}
	
	@DeleteMapping("/{id}")
	public EstadioEntity removeEstadio(@PathVariable("id") int id) {
		// percorrer o vetor para procurar o jogo
		for(EstadioEntity estadio: this.estadios) {
			if(estadio.getId() == id) {
				this.estadios.remove(estadio);
				return estadio; // remove e si do loop
			}
		}
		return null;
	}
	
	@PutMapping
	public EstadioEntity atualizaEstadio(@RequestBody EstadioEntity estadio) {
		
		for(EstadioEntity auxiliar: this.estadios) {
			if(auxiliar.getId() == estadio.getId()) {
				int posicao = this.estadios.indexOf(auxiliar);
				this.estadios.set(posicao, estadio);
				return estadio;
			}
		}
		return null;
	}
}
