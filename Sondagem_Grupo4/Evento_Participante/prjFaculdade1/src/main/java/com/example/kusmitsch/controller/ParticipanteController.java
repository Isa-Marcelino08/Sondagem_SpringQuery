package com.example.kusmitsch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kusmitsch.entities.Participante;
import com.example.kusmitsch.services.ParticipanteService;


@RestController
@RequestMapping("/participantes")
public class ParticipanteController {
	
	private final ParticipanteService participanteService;
	
	public ParticipanteController(ParticipanteService participanteService) {
		this.participanteService = participanteService;
	}
	
	// inserir 
	@PostMapping("/salvar")
	public Participante createParticipante(@RequestBody Participante participante) {
		return participanteService.insertParticipante(participante);
	}
	
	//pegar o id
	@GetMapping("/{id}")
	public Participante getParticipante(@PathVariable Long id ) {
		return participanteService.findParticipanteById(id);
	}
	
	// listar 
	@GetMapping("/listar")
	public List<Participante> getAllParticipantes(){
		return participanteService.findAllParticipantes();
		
	}
	
	// deletar 
	@DeleteMapping("/{id}")
	public void deleteParticipante(@PathVariable Long id) {
		participanteService.DeletarParticipante(id);
	}
	
	// query 
	
	@GetMapping("/pesquisar/{nome}")
	public Participante buscaPorNome(@PathVariable String nome){
		return participanteService.BuscarPorNomeContendo(nome);
	}

}

