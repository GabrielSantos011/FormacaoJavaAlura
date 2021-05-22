package Lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lista {
	
	public static void main(String args[]) {
		
		//listas sem tamanho pre definido
		//tem uma sequencia e aceitam duplicados
		
		
		//utiliza vetores
		ArrayList lista = new ArrayList(); // podemos colocar ArrayList(tamanho inicial do array) - assim que o tamanho for 
		//atingido ele cria outro array e transfere os dados
		//é melhor utilizado para iterações
		
		Conta c = new Conta();
		
		lista.add(c);
		
		Conta c1 = (Conta) lista.get(0);
		
		for (Object o : lista) {
			
		} //==
		
		for (int i = 0; i<lista.size(); i++) {
			
		}
		
		lista.remove(0);
		
		//é uma lista que utiliza a estrutura de dados lista duplamente encadeada
		// melhor para memória com adicão, remoção porém para iteraçã não é tão recomendado
		LinkedList listaLigada = new LinkedList();
		
		//para facilitar temos uma interface List
		//então podemos
		List lista1 = new ArrayList();
		List lista2 = new LinkedList();
		
		//temos a classe Arrays que ajuda bastante
		//não podemos mudar a assinatura do método main portanto temos um vetor lá
		//mas podemos transformar em lista rapidamente
		List argumentos = Arrays.asList(args);
		
		//temos ainda uma terceira opção para lista
		//o Vector, ele também utiliza arrays mas ele é threadsafe ou seja
		//podemos usar ele em mais de uma pilha de execução paralelamente
		List lista3 = new Vector();
	}

}
