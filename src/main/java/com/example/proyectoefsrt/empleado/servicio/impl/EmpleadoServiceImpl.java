package com.example.proyectoefsrt.empleado.servicio.impl;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import com.example.proyectoefsrt.empleado.repository.IEmpleadoRepository;
import com.example.proyectoefsrt.empleado.servicio.EmpleadoService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private IEmpleadoRepository repoEmpleado;

	@Override
	public List<Empleado> listarEmpleado() {
		return repoEmpleado.findAll();
	}

	@Override
	public Empleado obtenerEmpleado(int id) {
		return repoEmpleado.findById(id).orElse(null);
	}

	@Override
	public Empleado agregarEmpleado(Empleado empleado) {
		return repoEmpleado.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		Empleado empleadoAct = null;
		try {
			empleadoAct = repoEmpleado.findById(empleado.getIdEmpleado()).orElse(null);
			
			if(empleadoAct != null){
	        	empleadoAct.setDni(empleado.getDni());
	        	empleadoAct.setNom(empleado.getNom());
	        	empleadoAct.setApe(empleado.getApe());
	        	empleadoAct.setTel(empleado.getTel());
	        	empleadoAct.setUser(empleado.getUser());
	        	empleadoAct.setClave(empleado.getClave());
	        	empleadoAct.setImg(empleado.getImg());
	        	empleadoAct.setObjTipo(empleado.getObjTipo());
			 } else {
		            System.out.println("Empleado no encontrado con ID: " + empleado.getIdEmpleado());
		        }
		    } catch (Exception e) {
		        System.out.println("Error: " + e.getMessage());
		    }
		    return repoEmpleado.save(empleadoAct);
	}

	@Override
	public void eliminarEmpleado(int id) {
		try {
			repoEmpleado.deleteById(id);	
		}catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	
	@Override
    public Empleado obtenerEmpleadoUserClave(String user, String clave) {
        return repoEmpleado.findByUserAndClave(user, clave);
    }
}
