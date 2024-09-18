package co.edu.unbosque.model;

public class AguaDTO extends Producto {

	private double mililitros;

	public AguaDTO() {
		// TODO Auto-generated constructor stub
	}

	public AguaDTO(double mililitros) {
		super();
		this.mililitros = mililitros;
	}

	public AguaDTO(String marca, double precio, double mililitros) {
		super(marca, precio);
		this.mililitros = mililitros;
	}

	public AguaDTO(String marca, double precio) {
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
