package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.gustavoantunes.service_habitos.model.StatusObjetivo;
import br.com.gustavoantunes.service_habitos.model.Tarefa;

public class TarefaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private StatusObjetivo status;
	private Long metaId;

	public TarefaDTO(Tarefa tarefa) {
		this.id = tarefa.getId();
		this.nome = tarefa.getNome();
		this.descricao = tarefa.getDescricao();
		this.dataCriacao = tarefa.getDataCriacao();
		this.dataInicio = tarefa.getDataInicio();
		this.dataConclusao = tarefa.getDataConclusao();
		this.status = tarefa.getStatus();
		this.metaId = tarefa.getMeta().getId();
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

	public StatusObjetivo getStatus() {
		return status;
	}

	public Long getMetaId() {
		return metaId;
	}

}
