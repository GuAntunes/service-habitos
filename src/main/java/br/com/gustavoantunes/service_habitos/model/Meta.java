package br.com.gustavoantunes.service_habitos.model;

import java.time.LocalDate;
import java.util.List;

public class Meta {

	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;
	private List<Tarefa> tarefas;

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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	@Override
	public String toString() {
		return "Meta [nome=" + nome + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataConclusao="
				+ dataConclusao + ", imagem=" + imagem + ", tarefas=" + tarefas + "]";
	}

}
