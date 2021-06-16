package br.com.alura.java.io.unicodeEEncoding;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException, IOException {

    	//para saber qual é o code point
        String s = "ç";
        System.out.println(s.codePointAt(0));

        //para saber qual é o encoding padrão utilizado
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        //pegando os bytes com um encoding específico
        byte[] bytes = s.getBytes("windows-1252");
        //mostrando a quantidade de bytes utilizadas, o encode, ...
        System.out.print(bytes.length + ", windows-1252, ");
        //criando uma string através dos bytes e pasando qual encode utilizar
        //obs: se o encode for diferente do utilizado nos bytes pode dar erro nos charsets
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);
        
        //para leitura de arquivos:
        //primeiro devemos ir em ou no arquivo ou no projeto como um todo
        //clicar com o botão direito ir em properties e definir qual é o
        //encoding e passar por meio do construtor qual encoding estamos utilizando
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        Reader isr = new InputStreamReader(System.in, "UTF-8");
        PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8");
    }
}
