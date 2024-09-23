package co.edu.unbosque.view;

public class ViewFacade {

	VentanaInicio vi;
	VentanaCRUD vc;
	VentanaCrear vcr;
	VentanaEliminar ve;
	VentanaActualizar va;
	VentanaMostrar vm;

	public ViewFacade() {
		vi = new VentanaInicio();
		vc = new VentanaCRUD();
		vcr = new VentanaCrear();
		ve = new VentanaEliminar();
		va = new VentanaActualizar();
		vm = new VentanaMostrar();
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

	public VentanaEliminar getVe() {
		return ve;
	}

	public VentanaActualizar getVa() {
		return va;
	}

	public VentanaMostrar getVm() {
		return vm;
	}
	
	

}
