package br.com.gustavoantunes.service_habitos.resources;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
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

import br.com.gustavoantunes.service_habitos.dto.ObjetivoDTO;
import br.com.gustavoantunes.service_habitos.dto.ObjetivoFormCadDTO;
import br.com.gustavoantunes.service_habitos.dto.ObjetivoFormUpdateDTO;
import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.service.ObjetivoService;

//TO-DO: Implementar o Cache para otimizar as requisições

@RestController
@RequestMapping(value = "/meta")
public class MetaResource {

	@Autowired
	private ObjetivoService objetivoService;

//	@PostMapping
//	@Transactional
//	public ResponseEntity<ObjetivoDTO> cadastrar(@RequestBody @Valid ObjetivoFormCadDTO objetivoForm,
//			UriComponentsBuilder uriBuilder) {
//
//		Objetivo objetivo = objetivoForm.converter();
//		objetivo = objetivoService.save(objetivo);
//
//		URI uri = uriBuilder.path("/objetivo/{id}").buildAndExpand(objetivo.getId()).toUri();
//		return ResponseEntity.created(uri).body(new ObjetivoDTO(objetivo));
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<ObjetivoDTO> detalhar(@PathVariable Long id) {
//		Objetivo objetivo = objetivoService.findById(id);
//		return ResponseEntity.ok(new ObjetivoDTO(objetivo));
//	}
//
//	@DeleteMapping("/{id}")
//	@Transactional
//	public ResponseEntity<?> remover(@PathVariable Long id) {
//		objetivoService.deleteById(id);
//		return ResponseEntity.ok().build();
//	}
//
//	@GetMapping
//	public Page<ObjetivoDTO> lista(@PageableDefault(sort = "id", direction = Direction.ASC) Pageable paginacao) {
//
//		Page<Objetivo> objetivos = objetivoService.findAll(paginacao);
//
//		return ObjetivoDTO.converter(objetivos);
//	}
//
//	@PutMapping("/{id}")
//	@Transactional
//	public ResponseEntity<ObjetivoDTO> atualizar(@PathVariable Long id, @RequestBody ObjetivoFormUpdateDTO form) {
//
//		Objetivo objetivo = objetivoService.update(id, form);
//		return ResponseEntity.ok(new ObjetivoDTO(objetivo));
//	}
}
