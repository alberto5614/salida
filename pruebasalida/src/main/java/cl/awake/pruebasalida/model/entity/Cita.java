package cl.awake.pruebasalida.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas",catalog="clinica")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Citas")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_Paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "ID_Doctores")
    private Doctor doctor;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "ID_Facturas")
    private Factura factura;

	public Cita() {
		super();
		
	}

	public Cita(int id, Paciente paciente, Doctor doctor, Date fecha, Factura factura) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		this.factura = factura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", paciente=" + paciente + ", doctor=" + doctor + ", fecha=" + fecha + ", factura="
				+ factura + "]";
	}

    
}