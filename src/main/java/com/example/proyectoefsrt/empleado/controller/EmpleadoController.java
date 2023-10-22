package com.example.proyectoefsrt.empleado.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import com.example.proyectoefsrt.empleado.servicio.EmpleadoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/empleado")
@AllArgsConstructor
public class EmpleadoController {
	
	private EmpleadoService empleadoService;
	
	@GetMapping("")
    public List<Empleado> listarEmpleado(){
        return empleadoService.listarEmpleado();
    }
	
	 @GetMapping("/{id}")
	    public Empleado obtenerEmpleado(@PathVariable int id){
	        return empleadoService.obtenerEmpleado(id);
	    }
	 
	 @PostMapping("/insertar")
		@ResponseBody
		public Empleado agregarEmpleado(@RequestBody Empleado empleado) {
			return empleadoService.agregarEmpleado(empleado);
		}
	 
	 @PutMapping("/actualizar")
		@ResponseBody
		public Empleado actualizarEmpleado(@RequestBody Empleado empleado) {
			return empleadoService.actualizarEmpleado(empleado);
		}
	 

	 @DeleteMapping("/eliminar/{id}")
		public void eliminarEmpleado(@PathVariable int id) {
		 empleadoService.eliminarEmpleado(id);
		}
	
	

}
