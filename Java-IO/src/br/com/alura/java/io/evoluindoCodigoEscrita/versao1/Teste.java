package br.com.alura.java.io.evoluindoCodigoEscrita.versao1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws IOException {

		//Ao inv�s de usarmos as 3 classes que est�vamos acostumados:
//		OutputStream fos = new FileOutputStream("lorem2.txt");// este arquivo pode existir ou ser� criado na raiz do projeto
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		//podemos usar apenas o FileWriter
		
		FileWriter fw = new FileWriter("lorem3.txt");
		fw.write("Estou testando a escrita do FileWriter");
		//por�m o file writer n�o tem o m�todo newLine()
		//desta forma podemos usar os caracteres de quebra de linha
		//mas para windows � \r\n e para unix s� \n
		//portanto temos uma fun��o para isso
		fw.write(System.lineSeparator());
		//ou
		fw.write("\r\n");
		fw.write("escrevendo");
		
		fw.close();
		
		//por�m pode ser util continuar usando o BefferedWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		bw.write("ALOOOOOOOOO");
		bw.newLine();
		bw.newLine();
		bw.write("ALOOOOOO");
		
		bw.close();
		
		//obs: vimos a fun��o lineSeparator() da classe System
		//outra fun��o muito conecida e util � para medir tempo de execu��o em milisegundos
		//System.currentTimeMillis()
	}

}
