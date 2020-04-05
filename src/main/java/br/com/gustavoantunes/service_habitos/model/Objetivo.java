package br.com.gustavoantunes.service_habitos.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Objetivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	@Enumerated(EnumType.STRING)
	private StatusObjetivo status = StatusObjetivo.NAO_INICIADO;
//	private List<Meta> metas;
	
	
	public Objetivo() {
	}
	
	public Objetivo(String nome, String descricao, LocalDate dataInicio, LocalDate dataConclusao) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataConclusao = dataConclusao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	// Getters e Setters

}
