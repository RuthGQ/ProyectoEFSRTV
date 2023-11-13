package com.example.proyectoefsrt.empleado.repository;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
    Optional<Empleado> findByUserAndClave(String user, String clave);
}
