package Lista;

import java.util.ArrayList;

public class ListaComGenerics {
	
	public static void main(String args[]) {
		//as listas da outra classe são do tipo Object
		
		//lista generics - exclusiva para conta
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta c =new Conta(1111);
		
		lista.add(c);
		
		Conta c1 = lista.get(0);
		
		
	}

}
