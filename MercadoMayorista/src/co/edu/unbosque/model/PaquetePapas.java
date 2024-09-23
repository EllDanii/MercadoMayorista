package co.edu.unbosque.model;

import java.io.Serializable;

public class PaquetePapas extends Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4819605454950497095L;
	private String sabor;
	private double peso;
	private double calorias;

	public PaquetePapas() {
		// TODO Auto-generated constructor stub
	}

	public PaquetePapas(String sabor, double peso, double calorias) {
		super();
		this.sabor = sabor;
		this.peso = peso;
		this.calorias = calorias;
	}

	public PaquetePapas(String marca, double precio, String sabor, double peso, double calorias) {
		super(marca, precio);
		this.sabor = sabor;
		this.peso = peso;
		this.calorias = calorias;
	}

	public PaquetePapas(String marca, double precio) {
		super(marca, precio);
		// TODO Auto-generated constructor stub
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return super.toString() + "sabor: " + sabor + ", peso: " + peso + ", calorias: " + calorias;
	}

}
