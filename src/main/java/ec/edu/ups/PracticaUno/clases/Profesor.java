package ec.edu.ups.PracticaUno.clases;

public class Profesor 
{
	private String nombre;
	private String especialidadesMagicas;
	private String conociminetos;
	
	
	public Profesor() {
	}


	public Profesor(String nombre, String especialidadesMagicas, String conociminetos) {
		this.nombre = nombre;
		this.especialidadesMagicas = especialidadesMagicas;
		this.conociminetos = conociminetos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEspecialidadesMagicas() {
		return especialidadesMagicas;
	}


	public void setEspecialidadesMagicas(String especialidadesMagicas) {
		this.especialidadesMagicas = especialidadesMagicas;
	}


	public String getConociminetos() {
		return conociminetos;
	}


	public void setConociminetos(String conociminetos) {
		this.conociminetos = conociminetos;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", especialidadesMagicas=" + especialidadesMagicas + ", conociminetos="
				+ conociminetos + "]";
	}

	
	


}
