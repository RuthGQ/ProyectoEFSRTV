package com.example.proyectoefsrt.venta.servicio;

import com.example.proyectoefsrt.venta.dto.VentaTransactionDto;
import com.example.proyectoefsrt.venta.entity.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> listarVenta();
    Venta obtenerVenta(int id);
    Venta agregarVenta(VentaTransactionDto venta) throws Exception;
    Venta actualizarVenta(Venta venta);
    void eliminarVenta(int id);
}
