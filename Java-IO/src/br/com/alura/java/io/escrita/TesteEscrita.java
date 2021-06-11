package br.com.alura.java.io.escrita;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de sa�da de dados
		OutputStream fos = new FileOutputStream("lorem2.txt");// este arquivo pode existir ou ser� criado na raiz do projeto
		//binario para caracteres
		Writer osw = new OutputStreamWriter(fos);
		//de caracteres passamos a um nivel mais alto de linhas
		BufferedWriter bw = new BufferedWriter(osw);
					
		bw.write("Esta � a primeira linha");
		bw.newLine();
		bw.write("Esta � a segunda linha");
		bw.newLine();
		bw.newLine();
		bw.write("Esta � a quarta linha pois eu pulei uma linha");
		
		//fechando a entrada
		bw.close();// isto j� fecha o isr e o fis

	}

}
