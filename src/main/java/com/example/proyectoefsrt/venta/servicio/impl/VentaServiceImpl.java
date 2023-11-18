package com.example.proyectoefsrt.venta.servicio.impl;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.example.proyectoefsrt.carro.repository.ICarroRepository;
import com.example.proyectoefsrt.detalleVenta.entity.DetalleVenta;
import com.example.proyectoefsrt.detalleVenta.repository.IDetalleVentaRepository;
import com.example.proyectoefsrt.venta.dto.VentaTransactionDto;
import com.example.proyectoefsrt.venta.entity.Venta;
import com.example.proyectoefsrt.venta.repository.IVentaRepository;
import com.example.proyectoefsrt.venta.servicio.VentaService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VentaServiceImpl implements VentaService {

    private IVentaRepository repoVenta;
    private IDetalleVentaRepository repoDetalle;
    private ICarroRepository repoCarro;

    @Override
    public List<Venta> listarVenta() {
        return repoVenta.findAll();
    }

    @Override
    public Venta obtenerVenta(int id) {
        return repoVenta.findById(id).orElse(null);
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Venta agregarVenta(VentaTransactionDto venta) throws Exception {
        Venta ventaEntity = repoVenta.save(venta.getVenta());
        for (DetalleVenta detalle: venta.getDetalleVenta()){
            Carro carro = repoCarro.findById(detalle.getCarro().getId()).orElse(null);
            if (carro.getStock() < 0){
                throw new Exception();
            }
            detalle.setVenta(ventaEntity);
            repoDetalle.save(detalle);
            repoCarro.save(carro);
        }
        return ventaEntity;
    }

    @Override
    public Venta actualizarVenta(Venta venta) {
        Venta ventaFinded = repoVenta.findById(venta.getId()).orElse(null);
        if (ventaFinded != null){
            ventaFinded.setMonto(venta.getMonto());
            ventaFinded.setFecha((venta.getFecha()));
            ventaFinded.setNumserie(venta.getNumserie());
            ventaFinded.setCliente(venta.getCliente());
            ventaFinded.setEmpleado(venta.getEmpleado());
            repoVenta.save(ventaFinded);
        }
        return ventaFinded;
    }

    @Override
    public void eliminarVenta(int id) {
        repoVenta.deleteById(id);
    }

    @Override
    public Venta obtenerUltimaVenta(){
        return repoVenta.findFirstByOrderByIdDesc().orElse(null);
    }
}
