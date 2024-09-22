package co.edu.unbosque.view;

public class ViewFacade {

	VentanaInicio vi;
	VentanaCRUD vc;
	VentanaCrear vcr;

	public ViewFacade() {
		vi = new VentanaInicio();

		vc = new VentanaCRUD();
		vcr = new VentanaCrear();

	}

	public VentanaInicio getVi() {
		return vi;
	}

	public VentanaCRUD getVc() {
		return vc;
	}

	public VentanaCrear getVcr() {
		return vcr;
	}

}
