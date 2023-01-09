package org.pg.datos;

public class Empleado extends Persona {
	private Integer sueldo;
	private String categoria;
	private Departamentos departamento;

	public Empleado(Integer dni, String nombre, Integer edad, String estado, Integer sueldo, String categoria,
			Departamentos departamento) {
		super(dni, nombre, edad, estado);
		this.sueldo = sueldo;
		this.categoria = categoria;
		this.departamento = departamento;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + ", departamento=" + departamento + "]";
	}
	
}