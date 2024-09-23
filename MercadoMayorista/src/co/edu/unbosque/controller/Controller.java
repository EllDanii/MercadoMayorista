package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AguaDTO;
import co.edu.unbosque.model.CarneDTO;
import co.edu.unbosque.model.ChicleDTO;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PaquetePapasDTO;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	ModelFacade mf;
	ViewFacade vf;
	String tipo = "";

	public Controller() {
		vf = new ViewFacade();
		mf = new ModelFacade();
		asignarLectores();
		run();
	}

	public void run() {
		vf.getVi().setVisible(true);
	}

	public void asignarLectores() {
		vf.getVi().getBoton1().addActionListener(this);
		vf.getVi().getBoton1().setActionCommand("botonPapas");
		vf.getVi().getBoton2().addActionListener(this);
		vf.getVi().getBoton2().setActionCommand("botonCarnes");
		vf.getVi().getBoton3().addActionListener(this);
		vf.getVi().getBoton3().setActionCommand("botonChicles");
		vf.getVi().getBoton4().addActionListener(this);
		vf.getVi().getBoton4().setActionCommand("botonAgua");
		vf.getVi().getBoton5().addActionListener(this);
		vf.getVi().getBoton5().setActionCommand("botonSalir");

		vf.getVc().getBoton1().addActionListener(this);
		vf.getVc().getBoton1().setActionCommand("botonEliminar");
		vf.getVc().getBoton2().addActionListener(this);
		vf.getVc().getBoton2().setActionCommand("botonCrear");
		vf.getVc().getBoton3().addActionListener(this);
		vf.getVc().getBoton3().setActionCommand("botonActualizar");
		vf.getVc().getBoton4().addActionListener(this);
		vf.getVc().getBoton4().setActionCommand("botonMostar");
		vf.getVc().getBoton5().addActionListener(this);
		vf.getVc().getBoton5().setActionCommand("botonVolver");

		vf.getVcr().getBotonCrear().addActionListener(this);
		vf.getVcr().getBotonCrear().setActionCommand("botonCrearProducto");
		vf.getVcr().getBotonVolver().addActionListener(this);
		vf.getVcr().getBotonVolver().setActionCommand("botonVolver");

		vf.getVe().getBotonEliminar().addActionListener(this);
		vf.getVe().getBotonEliminar().setActionCommand("botonEliminarProducto");
		vf.getVe().getBotonVolver().addActionListener(this);
		vf.getVe().getBotonVolver().setActionCommand("botonVolver");

		vf.getVa().getBotonActualizar().addActionListener(this);
		vf.getVa().getBotonActualizar().setActionCommand("botonEliminarProducto");
		vf.getVa().getBotonVolver().addActionListener(this);
		vf.getVa().getBotonVolver().setActionCommand("botonVolver");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "botonPapas":
			vf.getVi().setVisible(false);
			vf.getVc().setVisible(true);
			tipo = "papas";
			vf.getVc().getTitulo1().setText("Que desea hacer con las papas?");
			break;
		case "botonCarnes":
			vf.getVi().setVisible(false);
			vf.getVc().setVisible(true);
			tipo = "carnes";
			vf.getVc().getTitulo1().setText("Que desea hacer con las carnes?");
			break;
		case "botonChicles":
			vf.getVi().setVisible(false);
			vf.getVc().setVisible(true);
			tipo = "chicles";
			vf.getVc().getTitulo1().setText("Que desea hacer con los chicles?");
			break;
		case "botonAgua":
			vf.getVi().setVisible(false);
			vf.getVc().setVisible(true);
			tipo = "aguas";
			vf.getVc().getTitulo1().setText("Que desea hacer con las aguas?");
			break;
		case "botonSalir":
			// falta mirar pa salir de la app
			break;
		case "botonCrear":
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(true);
			panelesCrear();
			break;
		case "botonActualizar":
			vf.getVc().setVisible(false);
			vf.getVa().setVisible(true);
			panelesActualizar();
			break;
		case "botonEliminar":
			vf.getVc().setVisible(false);
			vf.getVe().setVisible(true);
			panelesEliminar();
			break;
		case "botonMostrar":
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(true);
			break;
		case "botonVolver":
			vf.getVi().setVisible(true);
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(false);
			vf.getVe().setVisible(false);
			vf.getVa().setVisible(false);
			break;
		case "botonCrearProducto":

			break;
		case "botonEliminarProducto":

			break;

		default:
			break;
		}

	}

	public void panelesCrear() {
		if (tipo == "papas") {
			vf.getVcr().getPanelPapas().setVisible(true);
			vf.getVcr().getPanelCarne().setVisible(false);
			vf.getVcr().getPanelChicles().setVisible(false);
			vf.getVcr().getPanelAgua().setVisible(false);
		} else if (tipo == "carnes") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(true);
			vf.getVcr().getPanelChicles().setVisible(false);
			vf.getVcr().getPanelAgua().setVisible(false);
		} else if (tipo == "chicles") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(false);
			vf.getVcr().getPanelChicles().setVisible(true);
			vf.getVcr().getPanelAgua().setVisible(false);
		} else if (tipo == "aguas") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(false);
			vf.getVcr().getPanelChicles().setVisible(false);
			vf.getVcr().getPanelAgua().setVisible(true);
		}
	}

	public void panelesEliminar() {
		if (tipo == "carnes") {
			vf.getVe().getPanelCarne().setVisible(true);
			vf.getVe().getPanelProd().setVisible(false);
		} else {
			vf.getVe().getPanelCarne().setVisible(false);
			vf.getVe().getPanelProd().setVisible(true);
		}
	}

	public void panelesActualizar() {
		if (tipo == "papas") {
			vf.getVa().getPanelPapas().setVisible(true);
			vf.getVa().getPanelCarne().setVisible(false);
			vf.getVa().getPanelChicles().setVisible(false);
			vf.getVa().getPanelAgua().setVisible(false);
			vf.getVa().getEntMarcaVie().setVisible(true);
			vf.getVa().getPanMarcaVie().setVisible(true);
			vf.getVa().getEntCorteVie().setVisible(false);
			vf.getVa().getPanCorteVie().setVisible(false);
		} else if (tipo == "carnes") {
			vf.getVa().getPanelPapas().setVisible(false);
			vf.getVa().getPanelCarne().setVisible(true);
			vf.getVa().getPanelChicles().setVisible(false);
			vf.getVa().getPanelAgua().setVisible(false);
			vf.getVa().getEntMarcaVie().setVisible(false);
			vf.getVa().getPanMarcaVie().setVisible(false);
			vf.getVa().getEntCorteVie().setVisible(true);
			vf.getVa().getPanCorteVie().setVisible(true);
		} else if (tipo == "chicles") {
			vf.getVa().getPanelPapas().setVisible(false);
			vf.getVa().getPanelCarne().setVisible(false);
			vf.getVa().getPanelChicles().setVisible(true);
			vf.getVa().getPanelAgua().setVisible(false);
			vf.getVa().getEntMarcaVie().setVisible(true);
			vf.getVa().getPanMarcaVie().setVisible(true);
			vf.getVa().getEntCorteVie().setVisible(false);
			vf.getVa().getPanCorteVie().setVisible(false);
		} else if (tipo == "aguas") {
			vf.getVa().getPanelPapas().setVisible(false);
			vf.getVa().getPanelCarne().setVisible(false);
			vf.getVa().getPanelChicles().setVisible(false);
			vf.getVa().getPanelAgua().setVisible(true);
			vf.getVa().getEntMarcaVie().setVisible(true);
			vf.getVa().getPanMarcaVie().setVisible(true);
			vf.getVa().getEntCorteVie().setVisible(false);
			vf.getVa().getPanCorteVie().setVisible(false);
		}
	}

	public void crear() {
		boolean verif = false;

		String marca = vf.getVcr().getEntMarca().getText();
		double precio = Double.parseDouble(vf.getVcr().getEntPrecio().getText());

		if (tipo == "papas") {
			String sabor = vf.getVcr().getEntSaborPapas().getText();
			double peso = Double.parseDouble(vf.getVcr().getEntPesoPapas().getText());
			double calorias = Double.parseDouble(vf.getVcr().getEntCalorias().getText());

			verif = mf.getPapas().add(new PaquetePapasDTO(marca, precio, sabor, peso, calorias));
			JOptionPane.showMessageDialog(vf.getVc(), "Paquete de papas creado exitosamente");
			limpiarCrear();
		} else if (tipo == "carnes") {
			double peso = Double.parseDouble(vf.getVcr().getEntPesoCarne().getText());
			String tipo = vf.getVcr().getEntTipo().getText();
			String color = vf.getVcr().getEntColor().getText();
			String corte = vf.getVcr().getEntCorte().getText();

			verif = mf.getCarne().add(new CarneDTO(marca, precio, peso, tipo, color, corte));
			JOptionPane.showMessageDialog(vf.getVc(), "Carne creado exitosamente");
			limpiarCrear();
		} else if (tipo == "chicles") {
			int cantidad = Integer.parseInt(vf.getVcr().getEntCantidad().getText());
			boolean tieneAzucar = false;
			boolean bienAzucar = false;
			if (vf.getVcr().getEntAzucar().getText().toUpperCase().equals("SI")) {
				tieneAzucar = true;
				bienAzucar = true;
			} else if (vf.getVcr().getEntAzucar().getText().toUpperCase().equals("NO")) {
				tieneAzucar = false;
				bienAzucar = true;
			} else {
				JOptionPane.showMessageDialog(vf.getVc(), "Escribir si o no en la opcion de tiene azucar");
			}
			String sabor = vf.getVcr().getEntSaborChicle().getText();

			if (bienAzucar == true) {
				mf.getChicle().add(new ChicleDTO(marca, precio, cantidad, tieneAzucar, sabor));
				JOptionPane.showMessageDialog(vf.getVc(), "Chicle creado exitosamente");
				limpiarCrear();
			}

			
		} else if (tipo == "aguas") {
			double mililitros = Double.parseDouble(vf.getVcr().getEntMililitros().getText());
			
			mf.getAgua().add(new AguaDTO(marca, precio, mililitros));
			JOptionPane.showMessageDialog(vf.getVc(), "Agua creada exitosamente");
			limpiarCrear();
		}

	}
	
	public void limpiarCrear() {
		vf.getVcr().getEntPesoCarne().setText("");
		vf.getVcr().getEntPesoPapas().setText("");
		vf.getVcr().getEntMililitros().setText("");
		vf.getVcr().getEntTipo().setText("");
		vf.getVcr().getEntColor().setText("");
		vf.getVcr().getEntCorte().setText("");
		vf.getVcr().getEntCantidad().setText("");
		vf.getVcr().getEntAzucar().setText("");
		vf.getVcr().getEntSaborChicle().setText("");
		vf.getVcr().getEntSaborPapas().setText("");
		vf.getVcr().getEntCalorias().setText("");
		vf.getVcr().getEntMarca().setText("");
		vf.getVcr().getEntPrecio().setText("");
		vf.getVcr().setVisible(false);
		vf.getVc().setVisible(true);
	}

}
