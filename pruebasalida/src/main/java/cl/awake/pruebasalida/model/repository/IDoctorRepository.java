package cl.awake.pruebasalida.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.pruebasalida.model.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor,Integer>{

}
