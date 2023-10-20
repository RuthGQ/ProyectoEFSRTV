package com.example.proyectoefsrt.carro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.example.proyectoefsrt.carro.servicio.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {
	@Autowired
	private CarroService servicioCarro;
	
	@GetMapping(value = {"","/"})
	public List<Carro>listarCarro(){
		return servicioCarro.listrarCarro();
	}

}
