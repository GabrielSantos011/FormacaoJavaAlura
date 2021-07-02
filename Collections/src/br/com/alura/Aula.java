package br.com.alura;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	//boa prática sobrescrevendo o método toString();
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	//método da interface Comparable para eu mostrar qual é ordem natural
	//ex: obj.compareTo(obj2) - se obj > ob2 = 1
	//se obj < obj2 = -1 e se obj == obj1 = 0 
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
}
