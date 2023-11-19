package com.example.proyectoefsrt.detalleVenta.controller;

import com.example.proyectoefsrt.detalleVenta.entity.DetalleVenta;
import com.example.proyectoefsrt.detalleVenta.repository.IDetalleVentaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/detalleventa")
@AllArgsConstructor
public class DetalleVentaController {

    IDetalleVentaRepository detalleVentaRepository;

    @GetMapping("")
    public List<DetalleVenta> obtenerDetalles(){
        return detalleVentaRepository.findAll();
    }

    @GetMapping("filtrar")
    public List<DetalleVenta> filtrarPorFechaInicioFin(@RequestParam Long fechaIn, @RequestParam Long fechaFin){
        Date inicio = new Date(fechaIn);
        Date fin = new Date(fechaFin);
        return detalleVentaRepository.findDetalleVentasByVenta_FechaBetween(inicio,fin);
    }

}
