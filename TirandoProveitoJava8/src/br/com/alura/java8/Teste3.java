package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste3 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		//==
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//streams - como se fosse um fluxo/corrente
		Stream<Curso> streamDeCurso = cursos.stream();
		
		//com os streams temos métodos muito úteis para trabalhar com collections
		streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		
		//apesar de utilizar o filter a saída será a lista original pois o método não altera a collection
		//Isso é, apenas o stream será alterado, e nenhum outro objeto será impactado.
		cursos.forEach(c -> System.out.println(c.getNome()));

		//para alterar é necessário Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		streamDeCurso.forEach(c -> System.out.println(c.getNome()));
		
		//porém geralmente não usamos essa variável temporária e chamamos direto
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .forEach(c -> System.out.println(c.getNome()));
		
		//caso seja necessário pegar um fluxo dentro de um fluxo - função map
		//faz um fluxo de cursos, filtra ele, agora me da um fluxo de getAlunos (int) que está dentro da classe Curso
		//a partir desse momento a expessão está retornando um Stream<Integer> e não de curso
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		//existe ainda os stream primitivos que ajudam com alguns métodos específicos como 
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		
		//outro método interessante é
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny();
		//esse método retorna um Optional
		//um optional nos ajuda muito com relação ao null
		//nos poupando tempo com vários if
		Optional<Curso> optional = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .findAny();
		
		//podemos pegar o conteudo desse Optional, ou seja, um Curso
		
		Curso curso = optional.get();//caso não tenha nenhum será ançado uma exceção
		
		//para não ter uma exceção lançada podemos fazer
		curso = optional.orElse(new Curso());// or null -por ai vai
		//se tiver um curso ele dá o curso se não o parametro
		
		//alguns métodos
		optional.ifPresent(c -> System.out.println(c.getNome()));
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));
		optional.isPresent();
		
		//podemos ta,bém tranformar um stream em collection ou mapa desta maneira
		
		cursos = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .collect(Collectors.toList());
		
		Map mapa = cursos 
				.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
	}

}
