package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Agua;
import co.edu.unbosque.model.AguaDTO;

public class AguaDAO implements CRUDOperation<AguaDTO, Agua> {

	private ArrayList<Agua> aguaList;
	private final String FILE_NAME = "Aguas.csv";
	private final String SERIAL_NAME = "agua.dat";

	public AguaDAO() {
		readSerializable();
		FileHandler.checkFolder();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (aguaList.isEmpty()) {
			return "No hay aguas en la lista";
		} else {
			for (Agua agua : aguaList) {
				rta += agua;
			}
			return rta;
		}

	}

	@Override
	public ArrayList<AguaDTO> getAll() {
		return DataMapper.listaAguaToListaAguaDTO(aguaList);
	}

	@Override
	public boolean add(AguaDTO newData) {
		if (find(DataMapper.aguaDTOtoAgua(newData)) == null) {
			aguaList.add(DataMapper.aguaDTOtoAgua(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean delete(AguaDTO toDelete) {
		Agua found = find(DataMapper.aguaDTOtoAgua(toDelete));
		if (found != null) {
			writeSerializable();
			return aguaList.remove(found);
		} else {
			return false;
		}
	}

	@Override
	public boolean update(AguaDTO previous, AguaDTO newData) {
		Agua found = find(DataMapper.aguaDTOtoAgua(previous));
		if (found != null) {
			aguaList.remove(found);
			aguaList.add(DataMapper.aguaDTOtoAgua(newData));
			writeSerializable();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Agua find(Agua toFind) {
		Agua found = null;
		if (!aguaList.isEmpty()) {
			for (Agua a : aguaList) {
				if (a.getMarca().equals(toFind.getMarca())) {
					found = a;
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
		FileHandler.writeSerializable(SERIAL_NAME, aguaList);
	}

	public void readSerializable() {
		Object content = FileHandler.readSerializable(SERIAL_NAME);

		if (content == null) {
			aguaList = new ArrayList<>();
		} else {
			aguaList = (ArrayList<Agua>) content;
		}
	}

	public ArrayList<Agua> getAguaList() {
		return aguaList;
	}

	public void setAguaList(ArrayList<Agua> aguaList) {
		this.aguaList = aguaList;
	}
	
	

}
