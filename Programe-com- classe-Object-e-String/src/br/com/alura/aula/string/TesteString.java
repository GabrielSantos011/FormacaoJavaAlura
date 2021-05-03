package br.com.alura.aula.string;

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
		
		/*
		 * Uma das grandes vantagens da string � ser imutavel, por�m uma de suas maiores desvantagens tamb�m � essa;
		 * imagine que precisamos concatenar varias strings, em termo de desempenho seria muito ruim,
		 * por isso temos o StringBuilder, um tipo que tb implementa CharSequence por�m n�o � imutavel
		 */
	}
}
