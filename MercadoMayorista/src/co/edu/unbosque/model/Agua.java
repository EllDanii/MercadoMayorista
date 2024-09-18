package co.edu.unbosque.model;

public class Agua extends Producto {

	private double mililitros;

	public Agua() {
		// TODO Auto-generated constructor stub
	}

	public Agua(double mililitros) {
		super();
		this.mililitros = mililitros;
	}

	public Agua(String marca, double precio, double mililitros) {
		super(marca, precio);
		this.mililitros = mililitros;
	}

	public Agua(String marca, double precio) {
		super(marca, precio);
		// TODO Auto-generated constructor stub
	}

	public double getMililitros() {
		return mililitros;
	}

	public void setMililitros(double mililitros) {
		this.mililitros = mililitros;
	}

	@Override
	public String toString() {
		return super.toString() + "mililitros: " + mililitros;
	}

}
