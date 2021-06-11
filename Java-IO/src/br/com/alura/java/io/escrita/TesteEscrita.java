package br.com.alura.java.io.escrita;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de saída de dados
		OutputStream fos = new FileOutputStream("lorem2.txt");// este arquivo pode existir ou será criado na raiz do projeto
		//binario para caracteres
		Writer osw = new OutputStreamWriter(fos);
		//de caracteres passamos a um nivel mais alto de linhas
		BufferedWriter bw = new BufferedWriter(osw);
					
		bw.write("Esta é a primeira linha");
		bw.newLine();
		bw.write("Esta é a segunda linha");
		bw.newLine();
		bw.newLine();
		bw.write("Esta é a quarta linha pois eu pulei uma linha");
		
		//fechando a entrada
		bw.close();// isto já fecha o isr e o fis

	}

}
