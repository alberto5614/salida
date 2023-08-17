package cl.awake.pruebasalida.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes" ,catalog = "clinica")

public class Paciente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Paciente")
    private int id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Fecha_Nacimiento")
    private Date fechaNacimiento;

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(int id, String nombre, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

    
    
    
    
    
    
    
}
	
	

