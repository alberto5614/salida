package cl.awake.pruebasalida.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awake.pruebasalida.model.entity.Cita;
import cl.awake.pruebasalida.model.service.CitaService;

@RestController
@RequestMapping("/citas")
	public class CitaRestController {

	    @Autowired
	    private CitaService citaService;

	    
	    
	    
	    
	    @GetMapping
	    public List<Cita> obtenerTodasLasCitas() {
	        return citaService.getAll();
	    }

	    @PostMapping
	    public ResponseEntity<String> crearCita(@RequestBody Cita cita) {
	        citaService.create(cita);
	        return ResponseEntity.status(HttpStatus.CREATED).body("Cita creada exitosamente");
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<String> actualizarCita(@PathVariable int id, @RequestBody Cita cita) {
	        Cita existingCita = citaService.getById(id);
	        if (existingCita != null) {
	            cita.setId(id);
	            citaService.update(cita);
	            return ResponseEntity.ok("Cita actualizada exitosamente");
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	}

	
	

