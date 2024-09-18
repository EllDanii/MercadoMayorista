package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Agua;
import co.edu.unbosque.model.AguaDTO;
import co.edu.unbosque.model.Carne;
import co.edu.unbosque.model.CarneDTO;
import co.edu.unbosque.model.Chicle;
import co.edu.unbosque.model.ChicleDTO;
import co.edu.unbosque.model.PaquetePapas;
import co.edu.unbosque.model.PaquetePapasDTO;

public class DataMapper {

	public static Agua aguaDTOtoAgua(AguaDTO dto) {
		Agua entity;
		entity = new Agua(dto.getMarca(), dto.getPrecio(), dto.getMililitros());
		return entity;
	}

	public static AguaDTO aguaToAguaDTO(Agua entity) {
		AguaDTO dto;
		dto = new AguaDTO(entity.getMarca(), entity.getPrecio(), entity.getMililitros());
		return dto;
	}

	public static ArrayList<Agua> listaAguaDTOToListaAgua(ArrayList<AguaDTO> dtoList) {
		ArrayList<Agua> entityList = new ArrayList<>();

		for (AguaDTO a : dtoList) {
			entityList.add(new Agua(a.getMarca(), a.getPrecio(), a.getMililitros()));
		}
		return entityList;
	}

	public static ArrayList<AguaDTO> listaAguaToListaAguaDTO(ArrayList<Agua> entityList) {
		ArrayList<AguaDTO> dtoList = new ArrayList<>();

		for (Agua a : entityList) {
			dtoList.add(new AguaDTO(a.getMarca(), a.getPrecio(), a.getMililitros()));
		}
		return dtoList;
	}

	public static Carne carneDTOtoCarne(CarneDTO dto) {
		Carne entity;
		entity = new Carne(dto.getMarca(), dto.getPrecio(), dto.getPeso(), dto.getTipo(), dto.getColor(),
				dto.getCorte());
		return entity;
	}

	public static CarneDTO CarneToCarneDTO(Carne entity) {
		CarneDTO dto;
		dto = new CarneDTO(entity.getMarca(), entity.getPrecio(), entity.getPeso(), entity.getTipo(), entity.getColor(),
				entity.getCorte());
		return dto;
	}

	public static ArrayList<Carne> listaCarneDTOToListaCarne(ArrayList<CarneDTO> dtoList) {
		ArrayList<Carne> entityList = new ArrayList<>();

		for (CarneDTO c : dtoList) {
			entityList
					.add(new Carne(c.getMarca(), c.getPrecio(), c.getPeso(), c.getTipo(), c.getColor(), c.getCorte()));
		}
		return entityList;
	}

	public static ArrayList<CarneDTO> listaCarneToListaCarneDTO(ArrayList<Carne> entityList) {
		ArrayList<CarneDTO> dtoList = new ArrayList<>();

		for (Carne c : entityList) {
			dtoList.add(
					new CarneDTO(c.getMarca(), c.getPrecio(), c.getPeso(), c.getTipo(), c.getColor(), c.getCorte()));
		}
		return dtoList;
	}

	public static Chicle chicleDTOtoChicle(ChicleDTO dto) {
		Chicle entity;
		entity = new Chicle(dto.getMarca(), dto.getPrecio(), dto.getCantidad(), dto.isTieneAzucar(), dto.getSabor());
		return entity;
	}

	public static ChicleDTO chicletoChicleDTO(Chicle entity) {
		ChicleDTO dto;
		dto = new ChicleDTO(entity.getMarca(), entity.getPrecio(), entity.getCantidad(), entity.isTieneAzucar(),
				entity.getSabor());
		return dto;
	}

	public static ArrayList<Chicle> listaChicleDTOToListaChicle(ArrayList<ChicleDTO> dtoList) {
		ArrayList<Chicle> entityList = new ArrayList<>();

		for (ChicleDTO c : dtoList) {
			entityList.add(new Chicle(c.getMarca(), c.getPrecio(), c.getCantidad(), c.isTieneAzucar(), c.getSabor()));
		}
		return entityList;
	}

	public static ArrayList<ChicleDTO> listaChicleoListaChicleDTO(ArrayList<Chicle> entityList) {
		ArrayList<ChicleDTO> dtoList = new ArrayList<>();

		for (Chicle c : entityList) {
			dtoList.add(new ChicleDTO(c.getMarca(), c.getPrecio(), c.getCantidad(), c.isTieneAzucar(), c.getSabor()));
		}
		return dtoList;
	}

	public static PaquetePapas PaquetePapasDTOtoPaquetePapas(PaquetePapasDTO dto) {
		PaquetePapas entity;
		entity = new PaquetePapas(dto.getMarca(), dto.getPrecio(), dto.getSabor(), dto.getPeso(), dto.getCalorias());
		return entity;
	}

	public static PaquetePapasDTO PaquetePapastoPaquetePapasDTO(PaquetePapas entity) {
		PaquetePapasDTO dto;
		dto = new PaquetePapasDTO(entity.getMarca(), entity.getPrecio(), entity.getSabor(), entity.getPeso(),
				entity.getCalorias());
		return dto;
	}

	public static ArrayList<PaquetePapas> listaPaquetePapasDTOToListaPaquetePapas(ArrayList<PaquetePapasDTO> dtoList) {
		ArrayList<PaquetePapas> entityList = new ArrayList<>();

		for (PaquetePapasDTO p : dtoList) {
			entityList.add(new PaquetePapas(p.getMarca(), p.getPrecio(), p.getSabor(), p.getPeso(), p.getCalorias()));
		}
		return entityList;
	}

	public static ArrayList<PaquetePapasDTO> listaPaquetePapasToListaPaquetePapasDTO(
			ArrayList<PaquetePapas> entityList) {
		ArrayList<PaquetePapasDTO> dtoList = new ArrayList<>();

		for (PaquetePapas p : entityList) {
			dtoList.add(new PaquetePapasDTO(p.getMarca(), p.getPrecio(), p.getSabor(), p.getPeso(), p.getCalorias()));
		}
		return dtoList;
	}
}
