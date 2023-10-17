package com.example.proyectoefsrt.detalleVenta.repository;

import com.example.proyectoefsrt.detalleVenta.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    List<DetalleVenta> findByVentaId(int id);
}
