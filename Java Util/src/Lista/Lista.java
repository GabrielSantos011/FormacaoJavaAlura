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
		//� melhor utilizado para itera��es
		
		Conta c = new Conta();
		
		lista.add(c);
		
		Conta c1 = (Conta) lista.get(0);
		
		for (Object o : lista) {
			
		} //==
		
		for (int i = 0; i<lista.size(); i++) {
			
		}
		
		lista.remove(0);
		
		//� uma lista que utiliza a estrutura de dados lista duplamente encadeada
		// melhor para mem�ria com adic�o, remo��o por�m para itera�� n�o � t�o recomendado
		LinkedList listaLigada = new LinkedList();
		
		//para facilitar temos uma interface List
		//ent�o podemos
		List lista1 = new ArrayList();
		List lista2 = new LinkedList();
		
		//temos a classe Arrays que ajuda bastante
		//n�o podemos mudar a assinatura do m�todo main portanto temos um vetor l�
		//mas podemos transformar em lista rapidamente
		List argumentos = Arrays.asList(args);
		
		//temos ainda uma terceira op��o para lista
		//o Vector, ele tamb�m utiliza arrays mas ele � threadsafe ou seja
		//podemos usar ele em mais de uma pilha de execu��o paralelamente
		List lista3 = new Vector();
	}

}
