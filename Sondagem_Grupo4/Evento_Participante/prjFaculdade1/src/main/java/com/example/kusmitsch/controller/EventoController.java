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

import com.example.kusmitsch.entities.Evento;
import com.example.kusmitsch.services.EventoService;




@RestController
@RequestMapping("/eventos")
public class EventoController {

private final EventoService eventoService;
	
	public EventoController(EventoService eventoService) {
		this.eventoService = eventoService;
	}	
	
	
	@PostMapping("/salvar")
	public Evento creatEvento(@RequestBody Evento evento) {
		return eventoService.insertEvento(evento);
	}
	
	// pegar id
	@GetMapping("/{id}")
	public Evento getEventoById(@PathVariable Long id ) {
		return eventoService.findEventoById(id);
	}
	
	// listar 
	@GetMapping("/listar")
	public List<Evento> getAllCEventos(){
	return eventoService.findAllEvento();
		}
	
	
	@DeleteMapping("/{id}")
	public void deleteEvento(@PathVariable Long id) {
		eventoService.DeletarEvento(id);
	}
	
	// query 
		
	@GetMapping("/evento-participante/")
	public List<Evento> BuscarNomeEventoPorParticipante(@RequestParam String nomeParticipante){
		return eventoService.BuscarEventoPorParticipante(nomeParticipante);
	}

	
	
}


