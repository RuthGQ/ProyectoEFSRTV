package com.example.proyectoefsrt.cliente.repository;

import com.example.proyectoefsrt.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    public Cliente findByDni(String dni);

    public List<Cliente> findByNombre(String nombre);

    public List<Cliente> findByApellido(String apellido);
}
