package com.example.proyectoefsrt.cliente.servicio;

import java.util.List;

import com.example.proyectoefsrt.cliente.entity.Cliente;

public interface ClienteServicio {

	public Cliente insertarCliente(Cliente objCliente);
	public List<Cliente> listadoCliente();
	public void eliminarCliente(int idCli); 
	public Cliente actualizarCliente(Cliente cliente);
	public Cliente obtenerCliente(int idCli);

	Cliente obtenerClientePorDni(String nombre);

}
