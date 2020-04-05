package br.com.gustavoantunes.service_habitos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavoantunes.service_habitos.model.Objetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, Long>{

}
