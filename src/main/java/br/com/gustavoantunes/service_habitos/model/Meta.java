package br.com.gustavoantunes.service_habitos.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Meta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private String imagem;
	@Enumerated(EnumType.STRING)
	private StatusObjetivo status = StatusObjetivo.NAO_INICIADO;
	@ManyToOne
	@JoinColumn(name = "id_objetivo", nullable = false)
	private Objetivo objetivo;
	@OneToMany(mappedBy = "meta", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Tarefa> tarefas;

	public Meta() {
	}

	public Meta(String nome, String descricao, LocalDate dataInicio, LocalDate dataConclusao, String imagem,
			List<Tarefa> tarefas) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataConclusao = dataConclusao;
		this.imagem = imagem;
		if (tarefas != null) {
			this.tarefas = tarefas;
			this.tarefas.forEach(t -> t.setMeta(this));
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
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

	public StatusObjetivo getStatus() {
		return status;
	}

	public void setStatus(StatusObjetivo status) {
		this.status = status;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

}
