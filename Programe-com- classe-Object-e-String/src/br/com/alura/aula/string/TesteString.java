package br.com.alura.aula.string;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

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
		System.out.println("-------------------------------------------------------------");
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
		System.out.println("---------------------------------------------------------------");
		/*
		 * Uma das grandes vantagens da string é ser imutavel, porém uma de suas maiores desvantagens também é essa;
		 * imagine que precisamos concatenar varias strings, em termo de desempenho seria muito ruim,
		 * por isso temos o StringBuilder, um tipo que tb implementa CharSequence porém não é imutavel
		 */
		
		//formatação no sysout através de string
		int valor1 = 5;
		int valor2 = 5;
		int valor3 = 5;
		double valor4 = 10.0;
		double valor5 = 10.0;
		
		//new locale para seguir as formatações do brasil (, ao invés do .)
		String stringFormatada = String.format(new Locale("pt", "BR"), 
				"%s estes são os valores -> %04d - %01d - %03d - %010.3f - %.2f", "Olá", valor1, valor2, valor3, valor4, valor5);
		System.out.println(stringFormatada);
		//para demonstrar quebra de linha automatica
		System.out.println(stringFormatada);
		
		//isso equivale ao mesmo que - porem neste novvo caso não há quebra de linha automatica
		//portanto devemos colocar uma quebra de linha que no format é %n
		
		System.out.format(new Locale("pt", "BR"), 
				"%s estes são os valores -> %04d - %01d - %03d - %010.3f - %.2f %n", "Olá", valor1, valor2, valor3, valor4, valor5);
		System.out.format(new Locale("pt", "BR"), 
				"%s estes são os valores -> %04d - %01d - %03d - %010.3f - %.2f %n", "Olá", valor1, valor2, valor3, valor4, valor5);
		
		System.out.println("-----------------------------------------------------------------------------------");
		//obs: outra forma para formatar valores
		System.out.println(new DecimalFormat("0000000000").format(new BigDecimal("1110111")));
		
	}
}
