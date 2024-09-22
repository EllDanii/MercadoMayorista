package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewFacade;

public class Controller {

	ViewFacade vf;

	public Controller() {
		vf = new ViewFacade();
		run();
	}

	public void run() {
		vf.getVi().setVisible(true);
		vf.getVc().setVisible(true);
		vf.getVcr().setVisible(true);
	}
}
