package com.example.proyectoefsrt.empleado.repository;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
    Empleado findByUserAndClave(String user, String clave);
}
