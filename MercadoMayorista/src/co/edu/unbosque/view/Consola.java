package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);
	}

	public int leerEntero() {
		return sc.nextInt();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public float leerFloat() {
		return sc.nextFloat();
	}

	public double leerDouble() {
		return sc.nextDouble();
	}

	public String leerLinea() {
		return sc.nextLine();
	}

	public String leerPalabra() {
		return sc.next();
	}

	public boolean leerBooleano() {
		String entrada = leerPalabra();
		if (entrada.toUpperCase().equals("Si")) {
			return true;
		} else if (entrada.toUpperCase().equals("No")) {
			return false;
		}
		return false;
	}

	public char leerCaracter() {
		return sc.next().charAt(0);
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public void imprimirConSalto(String texto) {
		System.out.println(texto);
	}

	public void imprimirSinSalto(String texto) {
		System.out.print(texto);
	}
}
