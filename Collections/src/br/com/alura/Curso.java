package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	//uma coleção - lista permitem atributos repetidos e gaurdam ordem
	//ArrayList, LinkedList, Vector
	private List<Aula> aulas = new LinkedList<Aula>();
	//collection - um conjunto não se importa com a ordem e não permite que repita atributos
	//HashSet, LinkedSet
	private Set<Aluno> alunos = new HashSet<>();
	//Mapa - vincula um atributo a uma chave
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		//programação defensiva - retorna uma lista que não pode ser modificada
		//fazendo com que caso queira adicionar chame o método próprio para isso
		//ao invés de pegar getAulas().add(aula)
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		//idem ao de cima
		return Collections.unmodifiableSet(alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		//tem um portifólio no git explicando sobre expressões como essa
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	//boa prática
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal()
				+ ", aulas: + " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		//como funciona para adicionar em um map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		//método presente em todas as collections
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
