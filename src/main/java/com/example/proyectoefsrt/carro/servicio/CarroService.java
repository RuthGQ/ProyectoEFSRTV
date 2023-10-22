package com.example.proyectoefsrt.carro.servicio;

import java.util.List;

import com.example.proyectoefsrt.carro.entity.Carro;

public interface CarroService {
	public Carro insertarCarro(Carro objCarro);
	public List<Carro>listrarCarro();
	public Carro obtenerCarro(int id);
	
}
