package br.com.gustavoantunes.service_habitos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavoantunes.service_habitos.dto.ObjetivoDTO;
import br.com.gustavoantunes.service_habitos.dto.ObjetivoFormCadastroDTO;
import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.repository.ObjetivoRepository;

//TO-DO: Implementar o Cache para otimizar as requisições

@RestController
@RequestMapping(value = "/objetivo")
public class ObjetivoController {

	@Autowired
	private ObjetivoRepository objetivoRepository;

	// TO-DO: Utilizar o UriComponentsBuilder para retornar a consulta do objetivo
	// criado
	@PostMapping
	public ResponseEntity<ObjetivoDTO> cadastrar(@RequestBody ObjetivoFormCadastroDTO objetivoForm) {

		Objetivo objetivo = objetivoForm.converter();
		objetivo = objetivoRepository.save(objetivo);

		return ResponseEntity.ok(new ObjetivoDTO(objetivo));
	}

	@GetMapping("/{id}")
	public ResponseEntity<ObjetivoDTO> detalhar(@PathVariable Long id) {
		Optional<Objetivo> objetivo = objetivoRepository.findById(id);
		if (objetivo.isPresent()) {
			// TO-DO: Irá detalhar o obejtivo com as metas e tarefas
			return ResponseEntity.ok(new ObjetivoDTO(objetivo.get()));
		}
		return ResponseEntity.notFound().build();

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Objetivo> optional = objetivoRepository.findById(id);
		if (optional.isPresent()) {
			objetivoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}
