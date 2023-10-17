package com.example.proyectoefsrt.empleado.servicio.impl;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import com.example.proyectoefsrt.empleado.repository.IEmpleadoRepository;
import com.example.proyectoefsrt.empleado.servicio.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private IEmpleadoRepository repoEmpleado;

    @Override
    public Empleado obtenerEmpleadoUserClave(String user, String clave) {
        return repoEmpleado.findByUserAndClave(user, clave);
    }
}
