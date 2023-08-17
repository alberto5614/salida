package cl.awake.pruebasalida.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awake.pruebasalida.model.entity.Paciente;
import cl.awake.pruebasalida.model.repository.IPacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private IPacienteRepository pacREPO;
	
	public List<Paciente> findByNombre(String nombre) {
	    return pacREPO.findByNombre(nombre);
	}
	
	
	
}
