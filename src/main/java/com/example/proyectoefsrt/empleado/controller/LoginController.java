package com.example.proyectoefsrt.empleado.controller;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import com.example.proyectoefsrt.empleado.servicio.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {
    private EmpleadoService servicioEmpleado;

    @GetMapping("/empleadouserclave/{user}/{clave}")
    public Empleado obtenerEmpleadoUserClave(@PathVariable String user, @PathVariable String clave){
        return servicioEmpleado.obtenerEmpleadoUserClave(user, clave);
    }
}
