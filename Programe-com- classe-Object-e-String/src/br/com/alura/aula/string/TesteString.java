package br.com.alura.aula.string;

public class TesteString {

	public static void main(String args[]) {
		/*
		 * repare que aprendemos que para utilizar uma classe de outro pacote devemos
		 * importar, porém vemos a classe string ou a classe system ou até mesmos exceções como
		 * nullpointer e não vemos os seus imports, isso acontece pois eles
		 * pertemcem ao pacote java.lang é impossível programar sem esse pacote então o
		 * java já faz esse import automaticamente sem que a gente precise escrever
		 */
		
		String nome = "Gabriel"; //diferente de qualquer outra classe com a string não precisamos
		//dar o new String(); -- apesar de funcionar -- new String("Gabriel");
		
		//A STRING É IMUTAVEL
		//exemplo
		nome.toLowerCase();
		
		System.out.println(nome);// a saída permanece Gabriel e não gabriel
		//pois a string é imutavel, seus métodos retornam outra string porém não alteram o seu valor!
		
		//Alguns métodos mais utilizados -- exeistem diversos outros, olhas a documentação é o ideal
		
		nome.toLowerCase();//converte todos os caracteres mara minusculo
		nome.toUpperCase();//converte todos os caracteres para maiusculo
		nome.contains("bri");//verifica se há determinada sequencia na string
		nome.trim();//limpa espaços no começo e no fim da string
		nome.isEmpty();//verifica se a string esta vazia
		nome.charAt(3);//mostra o caracter na posição desejada
		nome.indexOf("bri");//qual posição essa sequencia se encontra
		nome.length();//quantidade de caracteres da string
		nome.substring(1);//devolve uma nova string(substring) a partir da posição desejada;
		nome.substring(0, 3);//devolve uma string(substring) entre esses caracteres
		String testeSplit = "um;dois;tres;quatro";
		String teste[] = testeSplit.split(";");//quebra a string sempre que ouver determinado caractere
		
		for (int i=0; i < 4; i++) {
			System.out.println(teste[i]);
		}
		
		/*
		 * Uma das grandes vantagens da string é ser imutavel, porém uma de suas maiores desvantagens também é essa;
		 * imagine que precisamos concatenar varias strings, em termo de desempenho seria muito ruim,
		 * por isso temos o StringBuilder, um tipo que tb implementa CharSequence porém não é imutavel
		 */
	}
}
