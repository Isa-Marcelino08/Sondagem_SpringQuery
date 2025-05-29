package com.example.kusmitsch.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.kusmitsch.entities.Participante;
import com.example.kusmitsch.repositories.ParticipanteRepository;

@Service
public class ParticipanteService {
	
	
	private final ParticipanteRepository participanteRepository;
	
	public ParticipanteService(ParticipanteRepository participanteRepository) {
		this.participanteRepository = participanteRepository;
			
	}
	
	public Participante findParticipanteById(Long id) {
		Optional<Participante> participante = participanteRepository.findById(id);
		return participante.orElse(null);
	}
	
	public Participante insertParticipante(Participante participante) {
		return participanteRepository.save(participante);
	}
	
	public void DeletarParticipante(Long id) {
		participanteRepository.deleteById(id);
	}
	
		public List<Participante> findAllParticipantes(){
			return participanteRepository.findAll();
		}
		
		public Participante BuscarPorNomeContendo(String nome){
			return participanteRepository.findByNomeContendo(nome);
		}

}
