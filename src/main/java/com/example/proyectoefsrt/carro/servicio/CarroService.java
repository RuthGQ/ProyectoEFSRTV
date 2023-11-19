package com.example.proyectoefsrt.carro.servicio;

import java.util.List;

import com.example.proyectoefsrt.carro.entity.Carro;

public interface CarroService {
	public List<Carro>listrarCarro();
	public Carro obtenerCarro(int id);
	public Carro insertarCarro(Carro objCarro);
	public Carro actualizarCarro(Carro carro);
	public void eliminarCarro(int id);
	public List<Carro> ListarPorMarca(String objMarca);
	public List<Carro> ListarPorModelo(String modelo);
}

