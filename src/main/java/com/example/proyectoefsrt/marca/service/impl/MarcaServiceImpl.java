package com.example.proyectoefsrt.marca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoefsrt.carro.repository.ICarroRepository;
import com.example.proyectoefsrt.marca.entity.Marca;
import com.example.proyectoefsrt.marca.repository.IMarcaRepository;
import com.example.proyectoefsrt.marca.service.MarcaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarcaServiceImpl implements MarcaService{
	
	@Autowired
	IMarcaRepository marcaRepo;
	
	public List<Marca> buscarMarca() {
		return marcaRepo.findAll();
	}
	
}
