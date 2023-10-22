package com.example.proyectoefsrt.empleado.servicio;

import java.util.List;

import com.example.proyectoefsrt.empleado.entity.Empleado;

public interface EmpleadoService {
	
	 public List<Empleado> listarEmpleado();
	 public Empleado obtenerEmpleado(int id);
	 public Empleado agregarEmpleado(Empleado empleado); 
	 public Empleado actualizarEmpleado(Empleado empleado); 
	 public void eliminarEmpleado(int id);
     Empleado obtenerEmpleadoUserClave(String user, String clave);
}
