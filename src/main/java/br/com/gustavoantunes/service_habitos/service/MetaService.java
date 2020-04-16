package br.com.gustavoantunes.service_habitos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavoantunes.service_habitos.dto.MetaFormCadDTO;
import br.com.gustavoantunes.service_habitos.dto.MetaFormUpdateDTO;
import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.repository.MetaRepository;
import br.com.gustavoantunes.service_habitos.service.exception.ObjectNotFoundException;

//TO-DO: Tratamento de Exception
@Service
public class MetaService {

	@Autowired
	private MetaRepository metaRepository;

	@Autowired
	private ObjetivoService objetivoService;

	public Meta save(MetaFormCadDTO metaForm) {
		Objetivo objetivo = objetivoService.findById(metaForm.getObjetivoId());
		Meta meta = metaForm.converter();
		meta.setObjetivo(objetivo);
		return metaRepository.save(meta);
	}

	public Meta findById(Long id) {

		Optional<Meta> meta = metaRepository.findById(id);
		return meta.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Meta.class.getName()));
	}

	public void deleteById(Long id) {
		Optional<Meta> optional = metaRepository.findById(id);
		if (optional.isPresent()) {
			metaRepository.deleteById(id);
		} else {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Meta.class.getName());
		}
	}

	public Meta update(Long id, MetaFormUpdateDTO form) {
		Optional<Meta> optional = metaRepository.findById(id);
		if (optional.isPresent()) {
			return form.atualizar(id, metaRepository);
		} else {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Meta.class.getName());
		}
	}

}
