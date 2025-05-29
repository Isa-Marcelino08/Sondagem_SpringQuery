package com.example.kusmitsch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.kusmitsch.entities.Evento;
import com.example.kusmitsch.entities.Participante;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}

