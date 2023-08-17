package cl.awake.pruebasalida.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.pruebasalida.model.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente,Integer> {
    List<Paciente> findByNombre(String nombre);
	
	
}
