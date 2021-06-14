package br.com.alura.java.io.evoluindoCodigoLeitura.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(new File("lorem.txt"));
		String linha = "";
		while (scan.hasNextLine()) {
			linha = scan.nextLine();
			System.out.println(linha);
		}
		
		scan.close();
		
		//outra forma bem utilizada
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("Digite um valor ");
		linha = scan1.nextLine(); //todos os valores vindos do scanner.nextLine são strings
		
		System.out.println(linha);
		
		//há porém o 
		System.out.print("Digite um valor ");
		int n = scan1.nextInt();
		System.out.println(n);
		
		scan1.close();
	}

}
