package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.ClientEntity;

public interface ClienteRepository extends JpaRepository<ClientEntity , Long>{
	// a interface herda todos os metodos da classe JpaRepository
	// assim, podemos fazer CRUD
}
