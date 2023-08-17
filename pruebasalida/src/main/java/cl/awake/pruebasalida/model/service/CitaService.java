package cl.awake.pruebasalida.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awake.pruebasalida.model.entity.Cita;
import cl.awake.pruebasalida.model.repository.ICitaRepository;

@Service
public class CitaService {
	
	@Autowired
	private ICitaRepository citREPO;
	
	public List<Cita> getAll(){
		return citREPO.findAll();
	}
	
	public void create(Cita c) {
		citREPO.save(c);
	}
	
	public void update(Cita c) {
		citREPO.save(c);
	}

	public Cita getById(int id) {
        return citREPO.findById(id).orElse(null);
    }
	
}
