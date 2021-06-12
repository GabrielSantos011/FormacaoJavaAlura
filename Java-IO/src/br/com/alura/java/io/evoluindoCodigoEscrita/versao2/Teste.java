package br.com.alura.java.io.evoluindoCodigoEscrita.versao2;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Teste {

	public static void main(String[] args) throws IOException {

		//Existem ainda versões de mais alto nível
		PrintStream ps = new PrintStream("lorem5.txt");
		
		ps.println("testando o print stram -1 linha");
		ps.println("println já quebra linha automatico");
		ps.println();
		ps.print("Já o print() n quebra linha automatico");
		
		ps.close();
		
		//essa calsse ja vem desde a versões antigas do java
		//antes bde existirem os writers e readers
		//logo após criarem o o Writer colocaram um:
		
		
		PrintWriter pw = new PrintWriter("lorem6.txt");
		
		pw.println("testando o print writer -1 linha");
		pw.println("println já quebra linha automatico");
		pw.println();
		pw.print("Já o print() n quebra linha automatico");
		
		pw.close();
		
	}

}
