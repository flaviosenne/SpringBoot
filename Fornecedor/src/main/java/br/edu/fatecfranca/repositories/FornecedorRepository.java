package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.entities.FornecedorEntity;

public interface FornecedorRepository extends MongoRepository<FornecedorEntity, String> {
	// esta interface herda todos os métodos de CRUD da classe MongoRepository
}
