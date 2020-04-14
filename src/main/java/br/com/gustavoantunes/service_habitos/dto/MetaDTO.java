package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.model.StatusObjetivo;

public class MetaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private StatusObjetivo status;
	private List<TarefaDTO> tarefas;
	private Long objetivoId;

	public MetaDTO(Meta meta) {
		this.id = meta.getId();
		this.nome = meta.getNome();
		this.descricao = meta.getDescricao();
		this.dataCriacao = meta.getDataCriacao();
		this.dataInicio = meta.getDataInicio();
		this.dataConclusao = meta.getDataConclusao();
		this.status = meta.getStatus();
		this.objetivoId = meta.getObjetivo().getId();
		if (meta.getTarefas() != null)
			this.tarefas = meta.getTarefas().stream().map(TarefaDTO::new).collect(Collectors.toList());
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

	public List<TarefaDTO> getTarefas() {
		return tarefas;
	}

	public Long getObjetivoId() {
		return objetivoId;
	}

}
