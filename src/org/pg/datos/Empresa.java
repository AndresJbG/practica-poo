package org.pg.datos;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private Integer cif;
	private Direccion direccion;
	private ArrayList<Departamentos> departamentos;
	public Empresa(String nombre, Integer cif, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
		departamentos=new ArrayList<>();
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion + "]";
	}
	
}