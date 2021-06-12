package br.com.alura.java.io.evoluindoCodigoEscrita.versao1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws IOException {

		//Ao invés de usarmos as 3 classes que estávamos acostumados:
//		OutputStream fos = new FileOutputStream("lorem2.txt");// este arquivo pode existir ou será criado na raiz do projeto
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		//podemos usar apenas o FileWriter
		
		FileWriter fw = new FileWriter("lorem3.txt");
		fw.write("Estou testando a escrita do FileWriter");
		//porém o file writer não tem o método newLine()
		//desta forma podemos usar os caracteres de quebra de linha
		//mas para windows é \r\n e para unix só \n
		//portanto temos uma função para isso
		fw.write(System.lineSeparator());
		//ou
		fw.write("\r\n");
		fw.write("escrevendo");
		
		fw.close();
		
		//porém pode ser util continuar usando o BefferedWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		bw.write("ALOOOOOOOOO");
		bw.newLine();
		bw.newLine();
		bw.write("ALOOOOOO");
		
		bw.close();
		
		//obs: vimos a função lineSeparator() da classe System
		//outra função muito conecida e util é para medir tempo de execução em milisegundos
		//System.currentTimeMillis()
	}

}
