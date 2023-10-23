package com.example.proyectoefsrt.cliente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoefsrt.cliente.entity.Cliente;
import com.example.proyectoefsrt.cliente.servicio.ClienteServicio;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {
	
	private ClienteServicio clienteServicio;
	
	@GetMapping
    public List<Cliente> listarClientes(){
        return clienteServicio.listadoCliente();
    }
	
	@GetMapping("/{id}")
    public Cliente obtenerCliente(@PathVariable int id){
        return clienteServicio.obtenerCliente(id);
    }
	 
	@PostMapping("/insertar")
	@ResponseBody
	public Cliente agregarCliente(@RequestBody Cliente cliente) {
		return clienteServicio.insertarCliente(cliente);
	}
	 
	@PutMapping("/actualizar")
	@ResponseBody
	public Cliente actualizarCliente(@RequestBody Cliente cliente) {
		return clienteServicio.actualizarCliente(cliente);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarCliente(@PathVariable int id) {
		clienteServicio.eliminarCliente(id);
	}
}