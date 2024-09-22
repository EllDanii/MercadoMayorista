package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PaquetePapas;
import co.edu.unbosque.model.PaquetePapasDTO;

public class PquetePapasDAO implements CRUDOperation<PaquetePapasDTO, PaquetePapas>{

	private ArrayList<PaquetePapas> paquetePapasList;
	private final String FILE_NAME = "PaquetePapas.csv";
	private final String SERIAL_NAME = "PaquetePapas.dat";

	public PquetePapasDAO() {
		readSerializable();
		FileHandler.checkFolder();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (paquetePapasList.isEmpty()) {
			return "No hay aguas en la lista";
		} else {
			for (PaquetePapas p : paquetePapasList) {
				rta += p;
			}
			return rta;
		}
	}

	@Override
	public ArrayList<PaquetePapasDTO> getAll() {
		return DataMapper.listaPaquetePapasToListaPaquetePapasDTO(paquetePapasList);
	}

	@Override
	public boolean add(PaquetePapasDTO newData) {
		if (find(DataMapper.PaquetePapasDTOtoPaquetePapas(newData)) == null) {
			paquetePapasList.add(DataMapper.PaquetePapasDTOtoPaquetePapas(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(PaquetePapasDTO toDelete) {
		PaquetePapas found = find(DataMapper.PaquetePapasDTOtoPaquetePapas(toDelete));
		if (found != null) {
			writeSerializable();
			return paquetePapasList.remove(found);
		} else {
			return false;
		}
	}

	@Override
	public boolean update(PaquetePapasDTO previous, PaquetePapasDTO newData) {
		PaquetePapas found = find(DataMapper.PaquetePapasDTOtoPaquetePapas(previous));
		if (found != null) {
			paquetePapasList.remove(found);
			paquetePapasList.add(DataMapper.PaquetePapasDTOtoPaquetePapas(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public PaquetePapas find(PaquetePapas toFind) {
		PaquetePapas found = null;
		if (!paquetePapasList.isEmpty()) {
			for (PaquetePapas p : paquetePapasList) {
				if (p.getMarca().equals(toFind.getMarca())) {
					found = p;
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
		FileHandler.writeSerializable(SERIAL_NAME, paquetePapasList);
	}

	public void readSerializable() {
		Object content = FileHandler.readSerializable(SERIAL_NAME);

		if (content == null) {
			paquetePapasList = new ArrayList<>();
		} else {
			paquetePapasList = (ArrayList<PaquetePapas>) content;
		}
	}

}
