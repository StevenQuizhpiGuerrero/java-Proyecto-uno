package ec.edu.ups.PracticaUno.clases;

public class Asignatura 
{
	private String nombreAsignatura;
	private String idEspecial;
	
	public Asignatura() {
	}

	public Asignatura(String nombreAsignatura, String idEspecial) {
		this.nombreAsignatura = nombreAsignatura;
		this.idEspecial = idEspecial;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getIdEspecial() {
		return idEspecial;
	}

	public void setIdEspecial(String idEspecial) {
		this.idEspecial = idEspecial;
	}
	public String agregarEstudiantes(String nombre) 
	{
		return "";}

	@Override
	public String toString() {
		return "Asignatura [nombreAsignatura=" + nombreAsignatura + ", idEspecial=" + idEspecial + "]";
	}


	


}
