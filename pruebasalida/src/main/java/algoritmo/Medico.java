package algoritmo;

public class Medico {
	private String especialidad;
	private int experiencia;

	public Medico(String especialidad, int experiencia) {
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
