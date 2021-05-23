package classesWrapper;

public class Wrappers {
	
	public static void main(String args[]) {
		//cada tipo primitivo tem uma classe wrapper
		
		Double double1;
		Float float1;
		Long long1;
		Character char1;
		Short short1;
		Byte byte1;
		Boolean boolean1;
		
		
		// uma list n aceita tipos primitivos
		//ou seja n podemos ter um List<int> na verdade temos que ter um List<Integer>
		//ao fazermos um list lista = new ArrayList();
		//lista.add(9) há uma conversão automatica de int para Integer (Autoboxing)
		
		Integer integer = new Integer(5); // maneira legada de se declarar
		Integer integer1 = Integer.valueOf(5);//recebe um primitivo e tranforma em Integer
		Integer integer2 = 5;
		
		int a = integer;//unboxing
		
		
		integer.intValue();//devolve um primitivo
		
		String b = "10";
		
		Integer numero = Integer.valueOf(b);//converte string em Integer
		int numero1 = Integer.parseInt(b); //converte string em primitivo
		
		//há diversos métyodos
		
		//Todos as classes wrappers que guardam tipos numérico extendem a classe Number
		//isso pode ser interessante por exemplo em List<Number> para uma lista de qlqr tipo numérico
	}

}
