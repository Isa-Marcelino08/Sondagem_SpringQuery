package com.example.kusmitsch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.kusmitsch.entities.Participante;
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {	
	@Query("SELECT p FROM Participante p WHERE LOWER(p.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
	Participante findByNomeContendo(@Param("nome") String nome);
}


