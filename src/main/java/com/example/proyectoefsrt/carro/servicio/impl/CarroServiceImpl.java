package com.example.proyectoefsrt.carro.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.example.proyectoefsrt.carro.repository.ICarroRepository;
import com.example.proyectoefsrt.carro.servicio.CarroService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarroServiceImpl implements CarroService {

	@Autowired
	private ICarroRepository repoCarro;
	
	@Override
	public List<Carro> listrarCarro() {
		return repoCarro.findAll();
	}

	@Override
	public Carro obtenerCarro(int id) {
		return repoCarro.findById(id).orElse(null);
	}
	
	@Override
	public Carro insertarCarro(Carro objCarro) {
		return repoCarro.save(objCarro);
	}

	@Override
	public Carro actualizarCarro(Carro carro) {
		Carro carroAct = null;
		try {
			carroAct = repoCarro.findById(carro.getId()).orElse(null);
			
			if(carroAct != null) {
				carroAct.setId(carro.getId());
				carroAct.setModelo(carro.getModelo());
				carroAct.setOrigen(carro.getOrigen());
				carroAct.setCombustible(carro.getCombustible());
				carroAct.setPrecio(carro.getPrecio());
				carroAct.setStock(carro.getStock());
				carroAct.setAnio(carro.getAnio());
				carroAct.setNroSerie(carro.getNroSerie());
				carroAct.setObjMarca(carro.getObjMarca());
			} else {
				System.out.println("No se encuentra el Id de carro" + carro.getId());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return repoCarro.save(carroAct);
	}
	
	@Override
	public void eliminarCarro(int id) {
		repoCarro.deleteById(id);
	}

	@Override
	public List<Carro> listarPorMarca(int objMarca) {
	    return repoCarro.findByObjMarcaIdmarca(objMarca);
	}

	@Override
	public List<Carro> listarPorModelo(String modelo) {
		return repoCarro.findByModelo(modelo);
	}


}
