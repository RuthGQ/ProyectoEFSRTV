package com.example.proyectoefsrt.marca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoefsrt.marca.entity.Marca;
import com.example.proyectoefsrt.marca.service.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	private MarcaService servicioMarca;
	
	@GetMapping("/list")
	public ResponseEntity<List<Marca>> list() {
		List<Marca> list = servicioMarca.buscarMarca();
		return new ResponseEntity<List<Marca>>(list, HttpStatus.OK);
	}
}
