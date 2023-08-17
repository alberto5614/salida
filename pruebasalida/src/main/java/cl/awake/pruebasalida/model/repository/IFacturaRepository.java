package cl.awake.pruebasalida.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awake.pruebasalida.model.entity.Factura;

public interface IFacturaRepository extends JpaRepository<Factura,Integer> {

}
