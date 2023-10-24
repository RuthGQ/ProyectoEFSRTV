package com.example.proyectoefsrt.venta.dto;

import com.example.proyectoefsrt.detalleVenta.entity.DetalleVenta;
import com.example.proyectoefsrt.venta.entity.Venta;

import java.util.List;

public class VentaTransactionDto {
    public Venta venta;
    public List<DetalleVenta> detalleVenta;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
}
