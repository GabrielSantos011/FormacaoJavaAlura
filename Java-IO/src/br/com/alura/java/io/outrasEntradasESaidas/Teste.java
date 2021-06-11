package br.com.alura.java.io.outrasEntradasESaidas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Teste {
	
	public static void main(String args []) throws IOException {

		InputStream fis = System.in;//entrada pelo console //new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;//saída pelo console //new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {//acrescentei o linha não pode ser vazio
			//para que ao dar um enter vazio no console a aplicação pare e não fique em loop infinito
			bw.write(linha);
			bw.newLine();
			bw.flush();//assim que es escrever ele ja solta o dado//sem isso eu precisava escrever todas as
			//linhas e somente depois ele solta no console
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
		//os input strems e output streams podem ser usados via console, arquivo, redes(dois ou mais computadores), servelets(web)...
	}

}
