package co.edu.unbosque.view;

public class ViewFacade {

	VentanaInicio vi;
<<<<<<< HEAD
	VentanaCRUD vc;
	VentanaCrear vcr;
=======
	VentanaCrearProducto vc;
>>>>>>> branch 'main' of https://github.com/EllDanii/MercadoMayorista.git

	public ViewFacade() {
		vi = new VentanaInicio();
<<<<<<< HEAD
		vc = new VentanaCRUD();
		vcr = new VentanaCrear();
=======
		vc= new VentanaCrearProducto();
>>>>>>> branch 'main' of https://github.com/EllDanii/MercadoMayorista.git
	}

	public VentanaInicio getVi() {
		return vi;
	}
<<<<<<< HEAD
	
	public VentanaCRUD getVc() {
		return vc;
	}

	public VentanaCrear getVcr() {
		return vcr;
	}
=======
	public VentanaCrearProducto getVc() {
		return vc;
	}
	
>>>>>>> branch 'main' of https://github.com/EllDanii/MercadoMayorista.git

}
