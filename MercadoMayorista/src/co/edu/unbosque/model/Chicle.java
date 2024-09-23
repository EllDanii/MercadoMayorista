package co.edu.unbosque.model;

import java.io.Serializable;

public class Chicle extends Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2952626443930430720L;
	private int cantidad;
	private boolean tieneAzucar;
	private String sabor;

	public Chicle() {
		// TODO Auto-generated constructor stub
	}

	public Chicle(int cantidad, boolean tieneAzucar, String sabor) {
		super();
		this.cantidad = cantidad;
		this.tieneAzucar = tieneAzucar;
		this.sabor = sabor;
	}

	public Chicle(String marca, double precio, int cantidad, boolean tieneAzucar, String sabor) {
		super(marca, precio);
		this.cantidad = cantidad;
		this.tieneAzucar = tieneAzucar;
		this.sabor = sabor;
	}

	public Chicle(String marca, double precio) {
		super(marca, precio);
		// TODO Auto-generated constructor stub
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return super.toString() + "cantidad: " + cantidad + ", tieneAzucar: " + tieneAzucar + ", sabor: " + sabor;
	}

}
