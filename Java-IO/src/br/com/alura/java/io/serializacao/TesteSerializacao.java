package br.com.alura.java.io.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialização é a transformação de um objeto em um fluxo de bits

		String string1 = "Gabriel Rafael dos Santos";

		//serializando
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("string.bin"));
		oos.writeObject(string1);
		oos.close();

		//desserializando
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("string.bin"));
        String string2 = (String) ois.readObject();
        ois.close();
        System.out.println(string2);
		
	}

}
