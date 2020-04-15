package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.repository.MetaRepository;

public class MetaFormUpdateDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@NotEmpty
	@Length(min = 1)
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;
	private Long objetivoId;

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

	public Long getObjetivoId() {
		return objetivoId;
	}
	
	public Meta atualizar(Long id, MetaRepository metaRepository) {
		Meta meta = metaRepository.getOne(id);
		
		meta.setNome(nome);
		meta.setDescricao(descricao);
		meta.setDataInicio(dataInicio);
		meta.setDataConclusao(dataConclusao);
		meta.setImagem(imagem);
		
		return meta;
	}

}
