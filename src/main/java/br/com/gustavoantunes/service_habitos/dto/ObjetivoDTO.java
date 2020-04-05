package br.com.gustavoantunes.service_habitos.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.gustavoantunes.service_habitos.model.Objetivo;

public class ObjetivoDTO {

	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;

	public ObjetivoDTO(Objetivo objetivo) {
		this.id = objetivo.getId();
		this.nome = objetivo.getNome();
		this.descricao = objetivo.getDescricao();
		this.dataInicio = objetivo.getDataInicio();
		this.dataConclusao = objetivo.getDataConclusao();
		this.dataCriacao = objetivo.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

}
