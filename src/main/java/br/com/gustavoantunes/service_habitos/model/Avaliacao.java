package br.com.gustavoantunes.service_habitos.model;

import java.time.LocalDateTime;

public class Avaliacao {

	private LocalDateTime data;
	private String descricao;
	private boolean status;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
