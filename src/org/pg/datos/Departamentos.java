package org.pg.datos;

public class Departamentos {
	private String nombre;
	private Integer identificador;
	private String localizacion;
	private String empresa;

	public Departamentos(String nombre, Integer identificador, String localizacion, String empresa) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.localizacion = localizacion;
		this.empresa = empresa;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Departamentos [nombre=" + nombre + ", identificador=" + identificador + ", localizacion=" + localizacion
				+ ", empresa=" + empresa + "]";
	}

}
