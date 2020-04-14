package br.com.gustavoantunes.service_habitos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavoantunes.service_habitos.dto.MetaFormCadDTO;
import br.com.gustavoantunes.service_habitos.model.Meta;
import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.repository.MetaRepository;

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

//	public Objetivo findById(Long id) {
//
//		Optional<Objetivo> objetivo = objetivoRepository.findById(id);
//		return objetivo.orElseThrow(() -> new ObjectNotFoundException(
//				"Objeto não encontrado! Id: " + id + ", Tipo: " + Objetivo.class.getName()));
//	}
//
//	public void deleteById(Long id) {
//		Optional<Objetivo> optional = objetivoRepository.findById(id);
//		if (optional.isPresent()) {
//			objetivoRepository.deleteById(id);
//		} else {
//			throw new ObjectNotFoundException(
//					"Objeto não encontrado! Id: " + id + ", Tipo: " + Objetivo.class.getName());
//		}
//	}
//
//	public Page<Objetivo> findAll(Pageable paginacao) {
//		return objetivoRepository.findAll(paginacao);
//	}
//
//	public Objetivo update(Long id, ObjetivoFormUpdateDTO form) {
//		Optional<Objetivo> optional = objetivoRepository.findById(id);
//		if (optional.isPresent()) {
//			return form.atualizar(id, objetivoRepository);
//		} else {
//			throw new ObjectNotFoundException(
//					"Objeto não encontrado! Id: " + id + ", Tipo: " + Objetivo.class.getName());
//		}
//	}

}
