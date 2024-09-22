package co.edu.unbosque.view;

public class ViewFacade {

	VentanaInicio vi;
	VentanaCrearProducto vc;

	public ViewFacade() {
		vi = new VentanaInicio();
		vc= new VentanaCrearProducto();
	}

	public VentanaInicio getVi() {
		return vi;
	}
	public VentanaCrearProducto getVc() {
		return vc;
	}
	

}
