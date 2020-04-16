package br.com.gustavoantunes.service_habitos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavoantunes.service_habitos.dto.TarefaFormCadDTO;
import br.com.gustavoantunes.service_habitos.dto.TarefaFormUpdateDTO;
import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.model.Tarefa;
import br.com.gustavoantunes.service_habitos.repository.TarefaRepository;
import br.com.gustavoantunes.service_habitos.service.exception.ObjectNotFoundException;

//TO-DO: Tratamento de Exception
@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	@Autowired
	private MetaService metaService;

	public Tarefa save(TarefaFormCadDTO tarefaForm) {
		Meta meta= metaService.findById(tarefaForm.getMetaId());
		Tarefa tarefa = tarefaForm.converter();
		tarefa.setMeta(meta);
		return tarefaRepository.save(tarefa);
	}

	public Tarefa findById(Long id) {

		Optional<Tarefa> tarefa = tarefaRepository.findById(id);
		return tarefa.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Tarefa.class.getName()));
	}

	public void deleteById(Long id) {
		Optional<Tarefa> optional = tarefaRepository.findById(id);
		if (optional.isPresent()) {
			tarefaRepository.deleteById(id);
		} else {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Tarefa.class.getName());
		}
	}

	public Tarefa update(Long id, TarefaFormUpdateDTO form) {
		Optional<Tarefa> optional = tarefaRepository.findById(id);
		if (optional.isPresent()) {
			return form.atualizar(id, tarefaRepository);
		} else {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Tarefa.class.getName());
		}
	}

}
