package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		//programando defensivamente colocando que o nome nunca poderá ser null
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	//boa prática sobrescrevendo o método toString();
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula
				+ "]";
	}
	
	//boa prática sobrescrevendo o método equals() para que ele não compare a referencia na memória;
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	//boa prática sobrescrevendo o método hashCode() para demonstrar qual é a regra 
	//que gera o numero para tabela de espalhamento
	@Override
	public int hashCode() {
		//aqui utilizei o método da classe string por ser melhor estruturado
		return this.nome.hashCode();
	}
	
}
