package cl.awake.pruebasalida.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.awake.pruebasalida.model.entity.Paciente;
import cl.awake.pruebasalida.model.service.PacienteService;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteService ps;
	
	
	@RequestMapping(path ="/busquedapaciente",method =RequestMethod.GET)
	public ModelAndView goCapacitacionDetalle() {
		return new ModelAndView("busquedapaciente");
}
	

	@RequestMapping("/detalle")
	public String buscarPacientesPorNombre(@RequestParam("nombre") String nombre, Model model) {
	    List<Paciente> pacientesEncontrados = ps.findByNombre(nombre);
	    
	    if (!pacientesEncontrados.isEmpty()) {
	        model.addAttribute("pacientesEncontrados", pacientesEncontrados);
	    } else {
	        model.addAttribute("mensaje", "No se encontró ningún paciente con el nombre: " + nombre);
	    }
	    
	    return "busquedapaciente"; // Debe coincidir con el nombre de la vista
	}
	
	
	
	
	
	
}
