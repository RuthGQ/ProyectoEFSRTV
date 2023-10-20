package com.example.proyectoefsrt.carro.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.example.proyectoefsrt.carro.repository.ICarroRepository;
import com.example.proyectoefsrt.carro.servicio.CarroService;

@Service
public class CarroServiceImpl implements CarroService {

	@Autowired
	private ICarroRepository repoCarro;
	
	@Override
	public Carro insertarCarro(Carro objCarro) {
		// TODO Auto-generated method stub
		return repoCarro.save(objCarro);
	}

	@Override
	public List<Carro> listrarCarro() {
		// TODO Auto-generated method stub
		return repoCarro.findAll();
	}

}
