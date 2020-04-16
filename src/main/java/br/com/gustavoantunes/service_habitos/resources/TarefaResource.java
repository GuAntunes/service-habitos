package br.com.gustavoantunes.service_habitos.resources;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.gustavoantunes.service_habitos.dto.TarefaDTO;
import br.com.gustavoantunes.service_habitos.dto.TarefaFormCadDTO;
import br.com.gustavoantunes.service_habitos.dto.TarefaFormUpdateDTO;
import br.com.gustavoantunes.service_habitos.model.Tarefa;
import br.com.gustavoantunes.service_habitos.service.TarefaService;

//TO-DO: Implementar o Cache para otimizar as requisições

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaResource {

	@Autowired
	private TarefaService tarefaService;

	@PostMapping
	@Transactional
	public ResponseEntity<TarefaDTO> cadastrar(@RequestBody @Valid TarefaFormCadDTO metaForm,
			UriComponentsBuilder uriBuilder) {

		Tarefa tarefa = tarefaService.save(metaForm);

		URI uri = uriBuilder.path("/meta/{id}").buildAndExpand(tarefa.getMeta().getId()).toUri();
		return ResponseEntity.created(uri).body(new TarefaDTO(tarefa));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<TarefaDTO> atualizar(@PathVariable Long id, @RequestBody TarefaFormUpdateDTO form) {

		Tarefa tarefa = tarefaService.update(id, form);
		return ResponseEntity.ok(new TarefaDTO(tarefa));
	}

	@GetMapping("/{id}")
	public ResponseEntity<TarefaDTO> detalhar(@PathVariable Long id) {
		Tarefa tarefa = tarefaService.findById(id);
		return ResponseEntity.ok(new TarefaDTO(tarefa));
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		tarefaService.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
