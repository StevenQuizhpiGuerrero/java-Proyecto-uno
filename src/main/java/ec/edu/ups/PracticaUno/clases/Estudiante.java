package ec.edu.ups.PracticaUno.clases;

public class Estudiante 
{
	//Creamos los atrivutos de la clase persona
	private String nombre;
	private int edad;
	private String idMagico;
	
	
	//Creamos un constructor vacio
	public Estudiante() {}

	//Creamos un constructor con Atributos especificos
	public Estudiante(String nombre, int edad, String idMagico) {
		this.nombre = nombre;
		this.edad = edad;
		this.idMagico = idMagico;
	}

	//Generamos getter and Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getIdMagico() {
		return idMagico;
	}


	public void setIdMagico(String idMagico) {
		this.idMagico = idMagico;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", idMagico=" + idMagico + "]";
	}
	
	
}
