package com.example.proyectoefsrt.cliente.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	        return "cliente/registroClientes";
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

		
		@PostMapping("/eliminar")
		public String eliminarCliente(@RequestParam("idCli") int idCli, Model model) {
		


			try {
				servicioCliente.eliminarCliente(idCli);
				System.out.println("SE ELIMINO CORRECTAMENTE");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    List<Cliente> clientes = servicioCliente.listadoCliente();
		    model.addAttribute("clientes", clientes);
		    
		   return "cliente/listadoClientes";
		   
		}
		
		
		@PostMapping("/obtenerid")
		public String obtenerIdCliente(@RequestParam("id_cliente") int id_cliente, Model model) {
		
			model.addAttribute("cliente", servicioCliente.obtenerCliente(id_cliente));
		    System.out.println("El codigo recogido es: " + id_cliente);
		    
		   return "cliente/actualizarCliente";
		}
		
		@PostMapping("/actualizar")
		public String actualizacionCliente(@ModelAttribute Cliente cliente, @RequestParam("id_cliente") int id_cliente ,Model model) {
			try {
				model.addAttribute("cliente", servicioCliente.actualizarCliente(cliente));
				System.out.println("El codigo recogido es: " + id_cliente);
				
			} catch (Exception e) {
				System.out.println("El codigo recogido es: " + e);
			}
			
		    List<Cliente> clientes = servicioCliente.listadoCliente();
		    model.addAttribute("clientes", clientes);
			
			return "cliente/listadoClientes";
		}
}
