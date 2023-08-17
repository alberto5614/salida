package algoritmo;

public class Detalle {
	private int edad;
	private String especialidad;
	private int experiencia;

	public Detalle(int edad) {
		this.edad = edad;

	}

	public Detalle(String especialidad, int experiencia) {

		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}
}