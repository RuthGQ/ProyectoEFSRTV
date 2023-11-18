package com.example.proyectoefsrt.venta.repository;

import com.example.proyectoefsrt.venta.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IVentaRepository extends JpaRepository<Venta, Integer> {
    Optional<Venta> findFirstByOrderByIdDesc();
    List<Venta> findVentaByFechaBetween(Date fechaInicio, Date fechaFin);
}
