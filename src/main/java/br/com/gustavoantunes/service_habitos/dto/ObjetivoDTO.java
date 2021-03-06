package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.model.StatusObjetivo;

public class ObjetivoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private StatusObjetivo status;
	private List<MetaDTO> metas;

	public ObjetivoDTO(Objetivo objetivo) {
		this.id = objetivo.getId();
		this.nome = objetivo.getNome();
		this.descricao = objetivo.getDescricao();
		this.dataInicio = objetivo.getDataInicio();
		this.dataConclusao = objetivo.getDataConclusao();
		this.dataCriacao = objetivo.getDataCriacao();
		this.status = objetivo.getStatus();
		if (objetivo.getMetas() != null)
			this.metas = objetivo.getMetas().stream().map(MetaDTO::new).collect(Collectors.toList());
	}
	
	public ObjetivoDTO() {
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

	public List<MetaDTO> getMetas() {
		return metas;
	}

	public static List<ObjetivoDTO> converter(List<Objetivo> objetivos) {
		return objetivos.stream().map(ObjetivoDTO::new).collect(Collectors.toList());
	}

}
