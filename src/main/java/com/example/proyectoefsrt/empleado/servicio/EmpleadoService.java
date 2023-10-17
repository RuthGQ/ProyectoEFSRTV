package com.example.proyectoefsrt.empleado.servicio;

import com.example.proyectoefsrt.empleado.entity.Empleado;

public interface EmpleadoService {
    Empleado obtenerEmpleadoUserClave(String user, String clave);
}
