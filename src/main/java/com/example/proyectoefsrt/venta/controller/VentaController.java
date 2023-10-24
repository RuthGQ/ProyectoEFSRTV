package com.example.proyectoefsrt.venta.controller;

import com.example.proyectoefsrt.venta.dto.VentaTransactionDto;
import com.example.proyectoefsrt.venta.entity.Venta;
import com.example.proyectoefsrt.venta.servicio.VentaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
@AllArgsConstructor
public class VentaController {

    private VentaService ventaService;

    @GetMapping("")
    public List<Venta> listarVenta(){
        return ventaService.listarVenta();
    }

    @GetMapping("/{id}")
    public Venta obtenerVenta(@PathVariable int id){
        return ventaService.obtenerVenta(id);
    }

    @PostMapping("/insertar")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public Venta agregarVenta(@RequestBody VentaTransactionDto venta) throws Exception{
        return ventaService.agregarVenta(venta);
    }

    @PutMapping("/actualizar")
    @ResponseBody
    public Venta actualizarVenta(@RequestBody Venta venta){
        return ventaService.actualizarVenta(venta);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarVenta(@PathVariable int id){
        ventaService.eliminarVenta(id);
    }
}
