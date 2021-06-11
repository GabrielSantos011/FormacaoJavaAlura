package br.com.alura.java.io.leitura;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException; -- � uma IOException
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de dados
		InputStream fis = new FileInputStream("lorem.txt");//este arquivo deve existir na raiz do projeto
		//pega o fluxo e transforma em caracteres
		Reader isr = new InputStreamReader(fis);
		//de caracteres passamos a um nivel mais alto de linhas
		BufferedReader br = new BufferedReader(isr);
		
		//obs: as linhas de c�dico acima est�o utilizando um padr�o de projetos
		//chamado Decorator - "um objeto decora outro sempre adicionando um novo comportamento"
		
		//obs: Streams foca em bits e bytes e readers em caracteres
		//FileInputStream � um InputStream (mais gen�rico pois os bytes n vem necessariamente de um arquivo -podem vir da rede por ex)
		//InputStreamReader e BufferedReader s�o Reader (mais gen�rico pois n precisa ser um reader que leia bytes como InputStreamReader)
		
		
		//maneira para ler o txt inteiro
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//fechando a entrada
		br.close();// isto j� fecha o isr e o fis
	}

}
