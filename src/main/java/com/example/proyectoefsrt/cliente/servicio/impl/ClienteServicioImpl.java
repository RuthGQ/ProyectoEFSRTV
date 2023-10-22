package com.example.proyectoefsrt.cliente.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectoefsrt.cliente.entity.Cliente;
import com.example.proyectoefsrt.cliente.repository.IClienteRepository;
import com.example.proyectoefsrt.cliente.servicio.ClienteServicio;

@Service
public class ClienteServicioImpl implements ClienteServicio{
	@Autowired
	private IClienteRepository repoCli;
	
	@Override
	public Cliente insertarCliente(Cliente objCliente) {
		return repoCli.save(objCliente);
	}

	@Override
	public List<Cliente> listadoCliente(){
		return repoCli.findAll();
	}

	@Override
	public void eliminarCliente(int idCli) {
		
		repoCli.deleteById(idCli);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		Cliente client = repoCli.findById(cliente.getIdCli()).orElse(null);
		if (client != null) {
			client.setIdCli(cliente.getIdCli());
			client.setNombre(cliente.getNombre());
			client.setApellido(cliente.getApellido());
			client.setDireccion(cliente.getDireccion());
			client.setTelefono(cliente.getTelefono());
			client.setCorreo(cliente.getCorreo());
			client.setDni(client.getDni());
          
            repoCli.save(client);
        }
		return repoCli.save(client);
	}

	@Override
	public Cliente obtenerCliente(int id_cliente) {
		
		return repoCli.findById(id_cliente).orElse(null);
	}

}
