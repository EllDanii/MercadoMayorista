package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Carne;
import co.edu.unbosque.model.CarneDTO;

public class CarneDAO implements CRUDOperation<CarneDTO, Carne> {

	private ArrayList<Carne> carneList;
	private final String FILE_NAME = "Carnes.csv";
	private final String SERIAL_NAME = "Carnes.dat";

	public CarneDAO() {
		readSerializable();
		FileHandler.checkFolder();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (carneList.isEmpty()) {
			return "No hay carnes en la lista";
		} else {
			for (Carne carne : carneList) {
				rta += carne + "\n";
			}
			return rta;
		}
	}

	@Override
	public ArrayList<CarneDTO> getAll() {
		return DataMapper.listaCarneToListaCarneDTO(carneList);
	}

	@Override
	public boolean add(CarneDTO newData) {
		if (find(DataMapper.carneDTOtoCarne(newData)) == null) {
			carneList.add(DataMapper.carneDTOtoCarne(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(CarneDTO toDelete) {
		Carne found = find(DataMapper.carneDTOtoCarne(toDelete));
		if (found != null) {
			writeSerializable();
			return carneList.remove(found);
		} else {
			return false;
		}
	}

	@Override
	public boolean update(CarneDTO previous, CarneDTO newData) {
		Carne found = find(DataMapper.carneDTOtoCarne(previous));
		if (found != null) {
			carneList.remove(found);
			carneList.add(DataMapper.carneDTOtoCarne(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Carne find(Carne toFind) {
		Carne found = null;
		if (!carneList.isEmpty()) {
			for (Carne c : carneList) {
				if (c.getCorte().equals(toFind.getCorte())) {
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
		FileHandler.writeSerializable(SERIAL_NAME, carneList);
	}

	public void readSerializable() {
		Object content = FileHandler.readSerializable(SERIAL_NAME);

		if (content == null) {
			carneList = new ArrayList<>();
		} else {
			carneList = (ArrayList<Carne>) content;
		}
	}

	public ArrayList<Carne> getCarneList() {
		return carneList;
	}

	public void setCarneList(ArrayList<Carne> carneList) {
		this.carneList = carneList;
	}

}
