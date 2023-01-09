package org.pg.datos;

public class Persona {

	private Integer dni;
	private String nombre;
	private Integer edad;
	private String estado;

	public Persona(Integer dni, String nombre, Integer edad, String estado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + "]";
	}
}
