package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.entities.PredioEntity;

public interface PredioRepository extends MongoRepository<PredioEntity, String>  {

}
