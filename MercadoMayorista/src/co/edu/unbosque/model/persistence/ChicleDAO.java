package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Chicle;
import co.edu.unbosque.model.ChicleDTO;

public class ChicleDAO implements CRUDOperation<ChicleDTO, Chicle> {

	private ArrayList<Chicle> chicleList;
	private final String FILE_NAME = "Chicles.csv";
	private final String SERIAL_NAME = "Chicles.dat";

	public ChicleDAO() {
		readSerializable();
		FileHandler.checkFolder();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (chicleList.isEmpty()) {
			return "No hay chicles en la lista";
		} else {
			for (Chicle chicle : chicleList) {
				rta += chicle;
			}
			return rta;
		}
	}

	@Override
	public ArrayList<ChicleDTO> getAll() {
		return DataMapper.listaChicleoListaChicleDTO(chicleList);
	}

	@Override
	public boolean add(ChicleDTO newData) {
		if (find(DataMapper.chicleDTOtoChicle(newData)) == null) {
			chicleList.add(DataMapper.chicleDTOtoChicle(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(ChicleDTO toDelete) {
		Chicle found = find(DataMapper.chicleDTOtoChicle(toDelete));
		if (found != null) {
			writeSerializable();
			return chicleList.remove(found);
		} else {
			return false;
		}
	}

	@Override
	public boolean update(ChicleDTO previous, ChicleDTO newData) {
		Chicle found = find(DataMapper.chicleDTOtoChicle(previous));
		if (found != null) {
			chicleList.remove(found);
			chicleList.add(DataMapper.chicleDTOtoChicle(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Chicle find(Chicle toFind) {
		Chicle found = null;
		if (!chicleList.isEmpty()) {
			for (Chicle c : chicleList) {
				if (c.getMarca().equals(toFind.getMarca())) {
					found = c;
					return found;
				} else {
					continue;
				}
			}
		} else {
			return null;
		}
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
