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
		
		//com os streams temos m�todos muito �teis para trabalhar com collections
		streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		
		//apesar de utilizar o filter a sa�da ser� a lista original pois o m�todo n�o altera a collection
		//Isso �, apenas o stream ser� alterado, e nenhum outro objeto ser� impactado.
		cursos.forEach(c -> System.out.println(c.getNome()));

		//para alterar � necess�rio Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
		streamDeCurso.forEach(c -> System.out.println(c.getNome()));
		
		//por�m geralmente n�o usamos essa vari�vel tempor�ria e chamamos direto
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .forEach(c -> System.out.println(c.getNome()));
		
		//caso seja necess�rio pegar um fluxo dentro de um fluxo - fun��o map
		//faz um fluxo de cursos, filtra ele, agora me da um fluxo de getAlunos (int) que est� dentro da classe Curso
		//a partir desse momento a expess�o est� retornando um Stream<Integer> e n�o de curso
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		//existe ainda os stream primitivos que ajudam com alguns m�todos espec�ficos como 
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		
		//outro m�todo interessante �
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny();
		//esse m�todo retorna um Optional
		//um optional nos ajuda muito com rela��o ao null
		//nos poupando tempo com v�rios if
		Optional<Curso> optional = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .findAny();
		
		//podemos pegar o conteudo desse Optional, ou seja, um Curso
		
		Curso curso = optional.get();//caso n�o tenha nenhum ser� an�ado uma exce��o
		
		//para n�o ter uma exce��o lan�ada podemos fazer
		curso = optional.orElse(new Curso());// or null -por ai vai
		//se tiver um curso ele d� o curso se n�o o parametro
		
		//alguns m�todos
		optional.ifPresent(c -> System.out.println(c.getNome()));
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));
		optional.isPresent();
		
		//podemos ta,b�m tranformar um stream em collection ou mapa desta maneira
		
		cursos = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .collect(Collectors.toList());
		
		Map mapa = cursos 
				.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
	}

}
