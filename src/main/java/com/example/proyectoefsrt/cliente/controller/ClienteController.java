package com.example.proyectoefsrt.cliente.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.proyectoefsrt.cliente.entity.Cliente;
import com.example.proyectoefsrt.cliente.servicio.ClienteServicio;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	  private final ClienteServicio servicioCliente;

	    @Autowired
	    public ClienteController(ClienteServicio servicioCliente) {
	        this.servicioCliente = servicioCliente;
	    }

	    @GetMapping("/registro")
	    public String mostrarFormularioRegistro(Model model) {
	        model.addAttribute("cliente", new Cliente());
	        return "cliente/registrocliente";
	    }

	    @PostMapping("/registro")
	    public String procesarFormularioRegistro(@ModelAttribute Cliente cliente) {
	        
	        servicioCliente.insertarCliente(cliente);
	        return "redirect:/cliente/listado";
	    }

	    @GetMapping("/listado")
	    public String mostrarListadoClientes(Model model) {
	        List<Cliente> clientes = servicioCliente.listadoCliente();
	        model.addAttribute("clientes", clientes);
	        return "cliente/listadocliente";
	    }

		
	    @PostMapping("/eliminar/{idCli}")
	    public String eliminarCliente(@PathVariable("idCli") int idCli, Model model) {
	        try {
	            servicioCliente.eliminarCliente(idCli);
	            System.out.println("SE ELIMINO CORRECTAMENTE");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return "redirect:/cliente/listado"; 
	    }
		
	    @GetMapping("/obtener/{idCli}")
	    public String obtenerIdCliente(@PathVariable("idCli") int idCli, Model model) {
	        Cliente cliente = servicioCliente.obtenerCliente(idCli);
	        model.addAttribute("cliente", cliente);
	        return "cliente/actualizarcliente";
	    }
		
	    @PostMapping("/actualizar/{idCli}") 
	    public String actualizacionCliente(@ModelAttribute Cliente cliente, @PathVariable("idCli") int idCli, Model model) {
	        try {
	           
	            servicioCliente.actualizarCliente(cliente);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return "redirect:/cliente/listado"; 
	    }
	}
