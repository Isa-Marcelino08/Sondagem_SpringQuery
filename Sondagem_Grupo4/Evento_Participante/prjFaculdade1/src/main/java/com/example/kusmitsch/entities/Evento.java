package com.example.kusmitsch.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeEvento;
	
	private String data;
	
	private String localizacao;
	
	
	@ManyToMany(mappedBy = "eventos", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Participante> participantes;
 
	
	public Evento() {
		
	}


	public Evento(Long id, String nomeEvento, String data, String localizacao, List<Participante> participantes) {
		super();
		this.id = id;
		this.nomeEvento = nomeEvento;
		this.data = data;
		this.localizacao = localizacao;
		this.participantes = participantes;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeEvento() {
		return nomeEvento;
	}


	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public List<Participante> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}	
}


