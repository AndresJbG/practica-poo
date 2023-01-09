package org.pg.datos;

public class Empleado {
	private Integer sueldo;
	private String categoria;
	private String departamento;

	public Empleado(Integer sueldo, String categoria, String departamento) {
		super();
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + ", departamento=" + departamento + "]";
	}

}
