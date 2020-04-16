package br.com.gustavoantunes.service_habitos.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.gustavoantunes.service_habitos.model.Tarefa;
import br.com.gustavoantunes.service_habitos.repository.TarefaRepository;

public class TarefaFormUpdateDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@NotEmpty
	@Length(min = 1)
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;
	private Long metaId;

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

	public Long getMetaId() {
		return metaId;
	}

	public Tarefa atualizar(Long id, TarefaRepository tarefaRepository) {
		Tarefa tarefa = tarefaRepository.getOne(id);

		tarefa.setNome(nome);
		tarefa.setDescricao(descricao);
		tarefa.setDataInicio(dataInicio);
		tarefa.setDataConclusao(dataConclusao);
		tarefa.setImagem(imagem);

		return tarefa;
	}

}
