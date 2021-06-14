package br.com.alura.aula.string;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

public class TesteString {

	public static void main(String args[]) {
		/*
		 * repare que aprendemos que para utilizar uma classe de outro pacote devemos
		 * importar, por�m vemos a classe string ou a classe system ou at� mesmos exce��es como
		 * nullpointer e n�o vemos os seus imports, isso acontece pois eles
		 * pertemcem ao pacote java.lang � imposs�vel programar sem esse pacote ent�o o
		 * java j� faz esse import automaticamente sem que a gente precise escrever
		 */
		
		String nome = "Gabriel"; //diferente de qualquer outra classe com a string n�o precisamos
		//dar o new String(); -- apesar de funcionar -- new String("Gabriel");
		
		//A STRING � IMUTAVEL
		//exemplo
		nome.toLowerCase();
		
		System.out.println(nome);// a sa�da permanece Gabriel e n�o gabriel
		System.out.println("-------------------------------------------------------------");
		//pois a string � imutavel, seus m�todos retornam outra string por�m n�o alteram o seu valor!
		
		//Alguns m�todos mais utilizados -- exeistem diversos outros, olhas a documenta��o � o ideal
		
		nome.toLowerCase();//converte todos os caracteres mara minusculo
		nome.toUpperCase();//converte todos os caracteres para maiusculo
		nome.contains("bri");//verifica se h� determinada sequencia na string
		nome.trim();//limpa espa�os no come�o e no fim da string
		nome.isEmpty();//verifica se a string esta vazia
		nome.charAt(3);//mostra o caracter na posi��o desejada
		nome.indexOf("bri");//qual posi��o essa sequencia se encontra
		nome.length();//quantidade de caracteres da string
		nome.substring(1);//devolve uma nova string(substring) a partir da posi��o desejada;
		nome.substring(0, 3);//devolve uma string(substring) entre esses caracteres
		String testeSplit = "um;dois;tres;quatro";
		String teste[] = testeSplit.split(";");//quebra a string sempre que ouver determinado caractere
		
		for (int i=0; i < 4; i++) {
			System.out.println(teste[i]);
		}
		System.out.println("---------------------------------------------------------------");
		/*
		 * Uma das grandes vantagens da string � ser imutavel, por�m uma de suas maiores desvantagens tamb�m � essa;
		 * imagine que precisamos concatenar varias strings, em termo de desempenho seria muito ruim,
		 * por isso temos o StringBuilder, um tipo que tb implementa CharSequence por�m n�o � imutavel
		 */
		
		//formata��o no sysout atrav�s de string
		int valor1 = 5;
		int valor2 = 5;
		int valor3 = 5;
		double valor4 = 10.0;
		double valor5 = 10.0;
		
		//new locale para seguir as formata��es do brasil (, ao inv�s do .)
		String stringFormatada = String.format(new Locale("pt", "BR"), 
				"%s estes s�o os valores -> %04d - %01d - %03d - %010.3f - %.2f", "Ol�", valor1, valor2, valor3, valor4, valor5);
		System.out.println(stringFormatada);
		//para demonstrar quebra de linha automatica
		System.out.println(stringFormatada);
		
		//isso equivale ao mesmo que - porem neste novvo caso n�o h� quebra de linha automatica
		//portanto devemos colocar uma quebra de linha que no format � %n
		
		System.out.format(new Locale("pt", "BR"), 
				"%s estes s�o os valores -> %04d - %01d - %03d - %010.3f - %.2f %n", "Ol�", valor1, valor2, valor3, valor4, valor5);
		System.out.format(new Locale("pt", "BR"), 
				"%s estes s�o os valores -> %04d - %01d - %03d - %010.3f - %.2f %n", "Ol�", valor1, valor2, valor3, valor4, valor5);
		
		System.out.println("-----------------------------------------------------------------------------------");
		//obs: outra forma para formatar valores
		System.out.println(new DecimalFormat("0000000000").format(new BigDecimal("1110111")));
		
	}
}
