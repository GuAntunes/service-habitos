//package br.com.gustavoantunes.service_habitos;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import br.com.gustavoantunes.service_habitos.model.Meta;
//import br.com.gustavoantunes.service_habitos.model.Objetivo;
//import br.com.gustavoantunes.service_habitos.model.Tarefa;
//
//public class TesteHabitos {
//
//	public static void main(String[] args) {
//
//		Objetivo objetivo = new Objetivo();
//		objetivo.setNome("Estudar Microservices em Java");
//		objetivo.setDescricao("Realizar cursos presencias e online afim de aprender sobre microservices");
//		objetivo.setDataInicio(LocalDate.now());
//		objetivo.setDataConclusao(LocalDate.of(2020, Month.JULY, 31));
//
//		List<Meta> metas = new ArrayList<>();
//
//		Meta m1 = new Meta();
//		m1.setNome("Realizar o curso de microservices spring cloud");
//		m1.setDescricao("Realizar o curso presencial na Caelum para obtenção de conhecimento na área");
//		m1.setDataInicio(LocalDate.now());
//		m1.setDataConclusao(LocalDate.of(2020, Month.MAY, 23));
//
//		Tarefa t1 = new Tarefa();
//		t1.setNome("Realizar matricula");
//		t1.setDescricao(
//				"Entrar em contato com a empresa para a negociação dos valores e resalização da matricula no curso");
//		t1.setDataConclusao(LocalDate.of(2020, Month.APRIL, 20));
//
//		Tarefa t2 = new Tarefa();
//		t2.setNome("Vagas de estacionamento");
//		t2.setDescricao("Pesquisar sobre vagas de estacionamento próximos do local do curso");
//		t2.setDataConclusao(LocalDate.of(2020, Month.APRIL, 25));
//
//		metas.add(m1);
//		m1.setTarefas(Arrays.asList(t1, t2));
//		
//		objetivo.setMetas(metas);
//		
//		System.out.println(objetivo);
//		
//	}
//}
