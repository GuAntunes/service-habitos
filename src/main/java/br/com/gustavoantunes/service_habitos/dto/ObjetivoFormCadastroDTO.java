package br.com.gustavoantunes.service_habitos.dto;

import java.time.LocalDate;

import br.com.gustavoantunes.service_habitos.model.Objetivo;

public class ObjetivoFormCadastroDTO {

	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

	public String getImagem() {
		return imagem;
	}
	
	public Objetivo converter() {
		return new Objetivo(nome, descricao, dataInicio, dataConclusao);
	}

}
