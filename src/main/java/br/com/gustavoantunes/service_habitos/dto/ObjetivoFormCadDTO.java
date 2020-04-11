package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.gustavoantunes.service_habitos.model.Objetivo;

public class ObjetivoFormCadDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotEmpty
	@Length(min = 1)
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;
	@Valid
	private List<MetaFormCadDTO> metas;

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

	public List<MetaFormCadDTO> getMetas() {
		return metas;
	}

	public Objetivo converter() {
		return new Objetivo(nome, descricao, dataInicio, dataConclusao, imagem,
				metas != null ? metas.stream().map(MetaFormCadDTO::converter).collect(Collectors.toList()) : null);
	}

}
