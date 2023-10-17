package com.example.proyectoefsrt.tipoEmpleado.repository;

import com.example.proyectoefsrt.tipoEmpleado.entity.TipoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoRepository extends JpaRepository<TipoEmpleado, Integer> {
}
