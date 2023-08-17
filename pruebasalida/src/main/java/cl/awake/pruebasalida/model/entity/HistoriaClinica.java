package cl.awake.pruebasalida.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Historia")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_Paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "ID_Doctores")
    private Doctor doctor;

    @Column(name = "Fecha_Cita")
    private Date fechaCita;

    @Column(name = "Sintomas")
    private String sintomas;

    @Column(name = "Diagnostico")
    private String diagnostico;

    @Column(name = "Tratamiento")
    private String tratamiento;

	public HistoriaClinica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoriaClinica(int id, Paciente paciente, Doctor doctor, Date fechaCita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
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

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "HistoriaClinica [id=" + id + ", paciente=" + paciente + ", doctor=" + doctor + ", fechaCita="
				+ fechaCita + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento
				+ "]";
	}

    
}