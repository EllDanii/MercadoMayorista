package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ModelFacade;
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
			vf.getVcr().setVisible(true);
			break;
		case "botonEliminar":
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(true);
			break;
		case "botonMostrar":
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(true);
			break;
		case "botonVolver":
			vf.getVi().setVisible(true);
			vf.getVc().setVisible(false);
			vf.getVcr().setVisible(false);
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
			System.out.println("p");
		} else if (tipo == "carnes") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(true);
			vf.getVcr().getPanelChicles().setVisible(false);
			vf.getVcr().getPanelAgua().setVisible(false);
			System.out.println("ca");
		} else if (tipo == "chicles") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(false);
			vf.getVcr().getPanelChicles().setVisible(true);
			vf.getVcr().getPanelAgua().setVisible(false);
			System.out.println("ch");
		} else if (tipo == "aguas") {
			vf.getVcr().getPanelPapas().setVisible(false);
			vf.getVcr().getPanelCarne().setVisible(false);
			vf.getVcr().getPanelChicles().setVisible(false);
			vf.getVcr().getPanelAgua().setVisible(true);
			System.out.println("a");
		}

	}

}
