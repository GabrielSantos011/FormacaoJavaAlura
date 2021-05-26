package Lista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntroducaoExprecoesLambda {
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
		
		// o significado é o mesmo do commit anterior, estamos criando uma classe anonima que implementa este método
		lista.sort((Conta conta1, Conta conta2) -> {
		        return Integer.compare(conta1.getNumeroConta(), conta1.getNumeroConta());
		    }
		);
		
		//há, ainda, uma maneira mais enxuta:
		//não precisamos passar o tipo dos parametros, estamos em uma lista de Contas então o java entende que é conta
		//e como é apenas uma linha não precisamos das chaves e da palavra chave return
		Comparator<Conta> comp = (conta11, conta22) -> Integer.compare(conta11.getNumeroConta(), conta22.getNumeroConta());
		
		lista.sort(comp);
		
		//as listas ainda tem um método for próprio que utilizamos assim:
		lista.forEach((conta) -> System.out.println(conta));
		
	}
}
