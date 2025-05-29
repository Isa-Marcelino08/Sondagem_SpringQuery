package com.example.kusmitsch.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.kusmitsch.entities.Evento;
import com.example.kusmitsch.entities.Participante;
import com.example.kusmitsch.repositories.EventoRepository;

@Service
public class EventoService {
	

private final EventoRepository eventoRepository; // cria uma variavel real 
	
	public EventoService(EventoRepository eventoRepository) { 
		this.eventoRepository = eventoRepository;
	}
	
	
	// preparando a busca por id
	public Evento findEventoById(Long id) {
		Optional<Evento> evento = eventoRepository.findById(id);
		return evento.orElse(null);
	}
	
	public void DeletarEvento(Long id) {
		eventoRepository.deleteById(id);
	}
	
	// preparando busca geral
	public List<Evento> findAllEvento(){
		return eventoRepository.findAll();
	}
	
	public Evento insertEvento(Evento evento) {
		return eventoRepository.save(evento);
	}

	public List<Evento> BuscarEventoPorParticipante(String nomeParticipante){
		return eventoRepository.findEventosByParticipante(nomeParticipante);
	}
	
	
	
	
}
