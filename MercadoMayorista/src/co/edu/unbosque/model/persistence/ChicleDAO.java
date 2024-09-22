package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Agua;
import co.edu.unbosque.model.Chicle;

public class ChicleDAO implements CRUDOperation<ChicleDAO, Chicle>{
	
	private ArrayList<Chicle> chicleList;
	private final String FILE_NAME = "Chicles.csv";
	private final String SERIAL_NAME = "Chicles.dat";
	
	public ChicleDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ChicleDAO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(ChicleDAO newData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ChicleDAO toDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ChicleDAO previous, ChicleDAO newData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Chicle find(Chicle toFind) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void writeSerializable() {
		FileHandler.writeSerializable(SERIAL_NAME, chicleList);
	}

	public void readSerializable() {
		Object content = FileHandler.readSerializable(SERIAL_NAME);

		if (content == null) {
			chicleList = new ArrayList<>();
		} else {
			chicleList = (ArrayList<Chicle>) content;
		}
	}
	
}
