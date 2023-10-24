package com.example.proyectoefsrt.venta.servicio.impl;

import com.example.proyectoefsrt.venta.dto.VentaTransactionDto;
import com.example.proyectoefsrt.venta.entity.Venta;
import com.example.proyectoefsrt.venta.servicio.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaService {
    @Override
    public List<Venta> listarVenta() {
        return null;
    }

    @Override
    public Venta obtenerVenta(int id) {
        return null;
    }

    @Override
    public Venta agregarVenta(VentaTransactionDto venta) throws Exception {
        return null;
    }

    @Override
    public Venta actualizarVenta(Venta venta) {
        return null;
    }

    @Override
    public void eliminarVenta(int id) {

    }
}
