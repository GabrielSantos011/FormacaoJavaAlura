package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Teste2 {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort(new Comparator<String> () {
		    public int compare(String s1, String s2) {
		        if(s1.length() < s2.length()) 
		            return -1;
		        if(s1.length() > s2.length()) 
		            return 1;
		        return 0;
		    }
		});
		
		Consumer<String> consumidor = new Consumer<String>() {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		};
		palavras.forEach(consumidor);
	
		//de classes anonimas para lambdas
		//utilizado em interfaces de função (geralmente com um único método)
		
		//consumer
		
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		//simplificando mais
		
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		//mais ainda
		
		palavras.forEach(s -> {
		    System.out.println(s);
		});
		
		//mais ainda
		
		palavras.forEach(s -> System.out.println(s));

		
		//comparator
		
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		// mais resumido
		
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});
		
		//mais ainda 
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// temos ainda uma classe com método estático que pode ajudar
		//dado um s (string) me retorne o length (int)
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//agora podemos implementar o Method reference para enxugar ainda mais o código
		//isso tem o mesmo siginificado de cima -  dou uma string e me retorne um int
		palavras.sort(Comparator.comparing(String::length));
		
		//lembrando que podemos usar o import static java.util.Comparator.*; para não ter que ficar chamando a classe toda vez
		
		//ainda com o Method reference
		palavras.forEach(s -> System.out.println(s));
		//é o mesmo que
		palavras.forEach(System.out::println);
		//estou te dando essa classe, me de um método
	}

}
