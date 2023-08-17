package cl.awake.pruebasalida.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.pruebasalida.model.entity.Cita;

public interface ICitaRepository extends JpaRepository<Cita,Integer> {

}
