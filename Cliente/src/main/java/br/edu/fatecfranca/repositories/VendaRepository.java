package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.VendasEntity;


public interface VendaRepository  extends JpaRepository<VendasEntity , Long> {

}
