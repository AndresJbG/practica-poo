package org.pg.datos;

import java.util.ArrayList;

public class Departamentos {
	private String nombre;
	private Integer identificador;
	private String localizacion;
	private Empresa empresa; // asociacion, empresa en la que esta el departamento.
	private ArrayList<Empleado> empleados; // lo que almacena en la lista.
	public Departamentos(String nombre, Integer identificador, String localizacion, Empresa empresa) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.localizacion = localizacion;
		this.empresa = empresa;
		empleados=new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Departamentos [nombre=" + nombre + ", identificador=" + identificador + ", localizacion=" + localizacion
				+ ", empresa=" + empresa + "]";
	}

}