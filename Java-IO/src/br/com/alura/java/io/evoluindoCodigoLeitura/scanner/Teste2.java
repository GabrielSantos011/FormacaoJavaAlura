package br.com.alura.java.io.evoluindoCodigoLeitura.scanner;

import java.io.File;
import java.io.IOException;
//import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Teste2 {
	public static void main(String ... args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()) {
        	String linha = scanner.nextLine();
        	System.out.println(linha);
        	//para pegar cada parte da linha csv podemos fazer um split

//        	String[] valores = linha.split(",");
//        	System.out.println(Arrays.toString(valores));
        	
        	//ou utilizar o próprio scanner
        	//devemos criar um novo scanner
        	//passar nele o fonte que queremos analisar
        	
        	Scanner linhaScanner = new Scanner(linha);
        	//colocamos um delimitador (regex) de onde deve ocorrer a separação
            linhaScanner.useDelimiter(",");
            //e colocarmos o padrão de onde estamos usando as regras - no caso US para que o double
            //seja separado por . e não por ,
            linhaScanner.useLocale(Locale.US);
            //então podemos usar agora o .next() que vai pegando um por um e não o nextLine()
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);

            linhaScanner.close();
        }
        scanner.close();
	}
}