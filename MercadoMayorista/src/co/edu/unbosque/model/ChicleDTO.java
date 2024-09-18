package co.edu.unbosque.model;

public class ChicleDTO extends Producto {

	private int cantidad;
	private boolean tieneAzucar;
	private String sabor;

	public ChicleDTO() {
		// TODO Auto-generated constructor stub
	}

	public ChicleDTO(int cantidad, boolean tieneAzucar, String sabor) {
		super();
		this.cantidad = cantidad;
		this.tieneAzucar = tieneAzucar;
		this.sabor = sabor;
	}

	public ChicleDTO(String marca, double precio, int cantidad, boolean tieneAzucar, String sabor) {
		super(marca, precio);
		this.cantidad = cantidad;
		this.tieneAzucar = tieneAzucar;
		this.sabor = sabor;
	}

	public ChicleDTO(String marca, double precio) {
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
