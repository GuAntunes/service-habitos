package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.repository.ObjetivoRepository;

public class ObjetivoFormUpdateDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotEmpty
	@Length(min = 1)
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

	public Objetivo atualizar(Long id, ObjetivoRepository objetivoRepository) {
		Objetivo objetivo = objetivoRepository.getOne(id);
		
		objetivo.setNome(nome);
		objetivo.setDescricao(descricao);
		objetivo.setDataInicio(dataInicio);
		objetivo.setDataConclusao(dataConclusao);
		objetivo.setImagem(imagem);
		
		return objetivo;
	}

}
