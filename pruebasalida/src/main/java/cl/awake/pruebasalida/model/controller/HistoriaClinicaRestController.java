package cl.awake.pruebasalida.model.controller;


	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import cl.awake.pruebasalida.model.entity.HistoriaClinica;
import cl.awake.pruebasalida.model.service.HistoriaClinicaService;

import java.util.List;

	@RestController
	@RequestMapping("/historiasclinicas")
	public class HistoriaClinicaRestController {

	    @Autowired
	    private HistoriaClinicaService historiaClinicaService;

	    @GetMapping
	    public ResponseEntity<List<HistoriaClinica>> getAllHistoriasClinicas() {
	        List<HistoriaClinica> historiasClinicas = historiaClinicaService.getAll();
	        return ResponseEntity.ok(historiasClinicas);
	    }

	   
	    
	    
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<HistoriaClinica> getHistoriaClinicaById(@PathVariable int id) {
	        HistoriaClinica historiaClinica = historiaClinicaService.getOne(id);
	        if (historiaClinica != null) {
	            return ResponseEntity.ok(historiaClinica);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Void> createHistoriaClinica(@RequestBody HistoriaClinica historiaClinica) {
	        historiaClinicaService.create(historiaClinica);
	        return ResponseEntity.created(null).build();
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Void> updateHistoriaClinica(@PathVariable int id, @RequestBody HistoriaClinica historiaClinica) {
	        if (historiaClinicaService.getOne(id) != null) {
	            historiaClinica.setId(id);
	            historiaClinicaService.update(historiaClinica);
	            return ResponseEntity.ok().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteHistoriaClinica(@PathVariable int id) {
	        HistoriaClinica historiaClinica = historiaClinicaService.getOne(id);
	        if (historiaClinica != null) {
	            historiaClinicaService.delete(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	}

	
	

