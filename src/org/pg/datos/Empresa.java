package org.pg.datos;

public class Empresa {
	private String nombre;
	private Integer cif;
	private String departamento;

	public Empresa(String nombre, Integer cif, String departamento) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCif() {
		return cif;
	}

	public void setCif(Integer cif) {
		this.cif = cif;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", cif=" + cif + ", departamento=" + departamento + "]";
	}

}
