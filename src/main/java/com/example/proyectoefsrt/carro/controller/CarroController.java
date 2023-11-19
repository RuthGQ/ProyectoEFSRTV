package com.example.proyectoefsrt.carro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.example.proyectoefsrt.carro.servicio.CarroService;
import com.example.proyectoefsrt.empleado.entity.Empleado;

@RestController
@RequestMapping("/carro")
public class CarroController {
	@Autowired
	private CarroService servicioCarro;
	
	@GetMapping("")
	public List<Carro>listarCarro(){
		return servicioCarro.listrarCarro();
	}
	
	@GetMapping("/{id}")
	public Carro obtenerCarro(@PathVariable int id) {
		return servicioCarro.obtenerCarro(id);
	}
	
	@PostMapping("/insertar")
	@ResponseBody
	public Carro insertarCarro(@RequestBody Carro carro) {
		return servicioCarro.insertarCarro(carro);
	}
	 
	@PutMapping("/actualizar")
	@ResponseBody
	public Carro actualizarCarro(@RequestBody Carro carro) {
		return servicioCarro.actualizarCarro(carro);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarVendedor(@PathVariable int id) {
		servicioCarro.eliminarCarro(id);
	}
	
	@GetMapping("/marca/{marca}")
	public List<Carro> ListarPorMarca(@PathVariable("marca") String marca) {
	    return servicioCarro.ListarPorMarca(marca);
	}
	
	@GetMapping("/modelo/{modelo}")
	public List<Carro> ListarPorModelo(@PathVariable("modelo") String modelo) {
	    return servicioCarro.ListarPorMarca(modelo);
	}
	
	

}

