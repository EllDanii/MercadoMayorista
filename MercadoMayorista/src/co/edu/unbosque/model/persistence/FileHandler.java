package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc; // Ve el contenido del archivo
	private static PrintWriter pw; // Capacidad de escribir en archivos
	private static File archivo; // Capacidad de manejar archivos
	private static final String FOLDER_NAME = "data";

	// Estas son las variables para serializar
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static FileInputStream fis;
	private static ObjectInputStream ois;

	public static void checkFolder() {
		archivo = new File(FOLDER_NAME);
		if (archivo.exists() && archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}

	public static void writeFile(String url, String content) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			pw = new PrintWriter(archivo);
			pw.write(content);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error al crear el archivo(archivo de texto)");
		}
	}

	public static String readFile(String url) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			} // Leer hasta EOF (End Of File)
			String contenido = "";
			sc = new Scanner(archivo);
			while (sc.hasNext()) {
				contenido += sc.nextLine() + "\n";
			}
			return contenido;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error en la lectura del archivo(archivo de texto)");
		}
		return null;

	}

	public static void writeSerializable(String url, Object content) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(content);
			fos.close();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace()
			System.out.println("Error al escribir en el archivo serializado");
		}

	}

	public static Object readSerializable(String url) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (archivo.exists()) {
				archivo.createNewFile();
			}
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			Object content = ois.readObject();
			fis.close();
			ois.close();
			return content;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error al leer el archivo serializado");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error al leer el archivo serializado");
		}
		return null;

	}

}
