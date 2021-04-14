package br.com.alura.java.view;

public class Teste {

	public static void main(String[] args) {
		
		//Agora caso eu queira fazer uma instancia de Entidade eu não posso
		//simplismente colocar Entidade e = new Entidade();
		//pois entidade não está no mesmo pacote.
		//o pacote faz parte do nome da classe (Full Qualified Name - FQN)
		//devemos mostrar onde a classe está definindo o nome completo (se estiver no
		//mesmo pacote não é necessário)
		//em um mesmo pacote não podemos ter duas classes com nomes iguais mas em pacotes diferentes sim.
		
		br.com.alura.java.model.Entidade e = new br.com.alura.java.model.Entidade();

	}

}
