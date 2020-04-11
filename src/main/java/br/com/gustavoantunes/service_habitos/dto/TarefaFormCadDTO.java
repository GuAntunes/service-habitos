package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.gustavoantunes.service_habitos.model.Tarefa;

public class TarefaFormCadDTO implements Serializable{

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

	public Tarefa converter() {

		return new Tarefa(nome, descricao, dataInicio, dataConclusao, imagem);
	}
}
