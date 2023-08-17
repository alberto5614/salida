package cl.awake.pruebasalida.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awake.pruebasalida.model.entity.HistoriaClinica;
import cl.awake.pruebasalida.model.repository.IHistoriaClinicaRepository;

@Service
public class HistoriaClinicaService {

	@Autowired
	private IHistoriaClinicaRepository hisREPO;
	
	
	public List<HistoriaClinica> getAll(){
		return hisREPO.findAll();
	}
	
	public void create(HistoriaClinica hi) {
		hisREPO.save(hi);
	}
	
	public void update(HistoriaClinica hi) {
		hisREPO.save(hi);
	}

	public void delete(int id) {
		hisREPO.deleteById(id);
		
	}
	
	public HistoriaClinica getOne(int id) {
        return hisREPO.getOne(id);
    }
	
	
}
