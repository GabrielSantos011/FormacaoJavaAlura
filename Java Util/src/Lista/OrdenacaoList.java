package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {

	public static void main(String []args) {
		Conta c1 = new Conta(1111111);
		Conta c2 = new Conta(55555555);
		Conta c3 = new Conta(222222222);
		Conta c4 = new Conta(4444444);
		Conta c5 = new Conta(1010101010);

		List<Conta> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("-----------------------");
		
		
		//function object - objeto apenas para executarmos uma função
		NumeroContaComparator arg = new NumeroContaComparator();
		lista.sort(arg);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//a maneira antiga que usavamos era
		Collections.sort(lista, new NumeroContaComparator());//reverse(lista) para ordenar decrescente
		
		//ou apenas Collection.sort(lista) - mas para isso precisamos definir uma ordem natural no tipo da lista
		//para isso nossa classe, nesse caso conta, tera que implementar a interface Comparable
		//essa interface nos fará implementar o metodo compareTo(T arg1) que nos mostrará qual é a ordem natural
		//vc faz esse método retornar int (negativo,0 e positivo) como na nossa classe logo abaixo
		//fazendo isso tb podemos ao invés de usar o Collections.sort(lista) usarmos lista.sort(null) mas isso não é recomendado
	}
}

//classe apenas para o método compare()

class NumeroContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c0, Conta c1) {
		if (c0.getNumeroConta() < c1.getNumeroConta()) {
			return -1;
		}
		
		if (c0.getNumeroConta() < c1.getNumeroConta()) {
			return 1;
		}
		return 0;// caso igauis
		
		//caso fosse uma comparação de strings podemos usar o método da classe string
		//que nos retorna um negativo ou um 0 ou um positivo
		//return string1.compareTo(string2);
	}
	
	//caso precise ordenar um array podemos utilizar a classe Arrays com o método sort();
}
