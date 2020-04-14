package br.com.gustavoantunes.service_habitos.resources;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.gustavoantunes.service_habitos.dto.MetaDTO;
import br.com.gustavoantunes.service_habitos.dto.MetaFormCadDTO;
import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.service.MetaService;

//TO-DO: Implementar o Cache para otimizar as requisições

@RestController
@RequestMapping(value = "/meta")
public class MetaResource {

	@Autowired
	private MetaService metaService;

	@PostMapping
	@Transactional
	public ResponseEntity<MetaDTO> cadastrar(@RequestBody @Valid MetaFormCadDTO metaForm,
			UriComponentsBuilder uriBuilder) {

		Meta meta = metaService.save(metaForm);

		URI uri = uriBuilder.path("/objetivo/{id}").buildAndExpand(meta.getObjetivo().getId()).toUri();
		return ResponseEntity.created(uri).body(new MetaDTO(meta));
	}
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
