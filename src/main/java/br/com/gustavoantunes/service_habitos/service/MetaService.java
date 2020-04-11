package br.com.gustavoantunes.service_habitos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.gustavoantunes.service_habitos.dto.ObjetivoFormUpdateDTO;
import br.com.gustavoantunes.service_habitos.model.Objetivo;
import br.com.gustavoantunes.service_habitos.repository.ObjetivoRepository;
import br.com.gustavoantunes.service_habitos.service.exception.ObjectNotFoundException;

//TO-DO: Tratamento de Exception
@Service
public class MetaService {

	@Autowired
	private ObjetivoRepository objetivoRepository;

//	public Objetivo save(Objetivo objetivo) {
//		return objetivoRepository.save(objetivo);
//	}
//
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
