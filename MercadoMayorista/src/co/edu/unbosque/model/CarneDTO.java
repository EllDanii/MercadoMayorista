package co.edu.unbosque.model;

public class CarneDTO extends Producto {

	private double peso;
	private String tipo;
	private String color;
	private String corte;

	public CarneDTO() {
		// TODO Auto-generated constructor stub
	}

	public CarneDTO(double peso, String tipo, String color, String corte) {
		super();
		this.peso = peso;
		this.tipo = tipo;
		this.color = color;
		this.corte = corte;
	}

	public CarneDTO(String marca, double precio, double peso, String tipo, String color, String corte) {
		super(marca, precio);
		this.peso = peso;
		this.tipo = tipo;
		this.color = color;
		this.corte = corte;
	}

	public CarneDTO(String marca, double precio) {
		super(marca, precio);
		// TODO Auto-generated constructor stub
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public String toString() {
		return super.toString() + "peso:" + peso + ", tipo:" + tipo + ", color:" + color + ", corte:" + corte + "\n";
	}

}
