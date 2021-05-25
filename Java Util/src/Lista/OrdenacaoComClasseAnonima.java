package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoComClasseAnonima {
	
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
		
		//aqui estamos declarando uma classe anonima que utiliza a interface Comparator
		lista.sort(new Comparator<Conta>() {

		    @Override
		    public int compare(Conta c1, Conta c2) {
		        return Integer.compare(c1.getNumeroConta(), c2.getNumeroConta());
		    }
		} //fim da classe anonima

		);//fim do método
		
		//OU
		
		//poderiamos declarar a classe anonima assim;
		Comparator<Conta> comp = new Comparator<Conta>() {

			@Override
		    public int compare(Conta c1, Conta c2) {
		        return Integer.compare(c1.getNumeroConta(), c2.getNumeroConta());
		    }
		};//e passar como parametro
		lista.sort(comp);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
