package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity , Long>{

}
