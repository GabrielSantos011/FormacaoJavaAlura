package br.com.alura.java.io.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoMeuObjeto {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//explicação na classe Objeto
		Objeto obj = new Objeto();
		obj.setArg1("teste");

		//serializando
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(obj);
		oos.close();

		//desserializando
		Objeto obj2 = new Objeto();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		obj2 = (Objeto) ois.readObject();
        ois.close();
        System.out.println(obj2.getArg1());
		
		
	}

}
