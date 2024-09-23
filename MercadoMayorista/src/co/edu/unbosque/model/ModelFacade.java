package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AguaDAO;
import co.edu.unbosque.model.persistence.CarneDAO;
import co.edu.unbosque.model.persistence.ChicleDAO;
import co.edu.unbosque.model.persistence.PquetePapasDAO;

public class ModelFacade {
	
	CarneDAO carne;
	PquetePapasDAO papas;
	AguaDAO agua;
	ChicleDAO chicle;
	
	public ModelFacade() {
		carne = new CarneDAO();
		papas = new PquetePapasDAO();
		agua = new AguaDAO();
		chicle = new ChicleDAO();
	}

	public CarneDAO getCarne() {
		return carne;
	}

	public PquetePapasDAO getPapas() {
		return papas;
	}

	public AguaDAO getAgua() {
		return agua;
	}

	public ChicleDAO getChicle() {
		return chicle;
	}
	
	
	
}
