package co.edu.unbosque.model;

public class Producto {

	private String marca;
	private double precio;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "marca: " + marca + ", precio: " + precio + " ";
	}

}
