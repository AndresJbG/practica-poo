package org.pg.datos;

public class Contratos {
	private Integer fechaCreacion;
	private String datosEmpleado;
	private String datosEmpresa;
	public Contratos(Integer fechaCreacion, String datosEmpleado, String datosEmpresa) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.datosEmpleado = datosEmpleado;
		this.datosEmpresa = datosEmpresa;
	}
	public Integer getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Integer fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getDatosEmpleado() {
		return datosEmpleado;
	}
	public void setDatosEmpleado(String datosEmpleado) {
		this.datosEmpleado = datosEmpleado;
	}
	public String getDatosEmpresa() {
		return datosEmpresa;
	}
	public void setDatosEmpresa(String datosEmpresa) {
		this.datosEmpresa = datosEmpresa;
	}
	@Override
	public String toString() {
		return "Contratos [fechaCreacion=" + fechaCreacion + ", datosEmpleado=" + datosEmpleado + ", datosEmpresa="
				+ datosEmpresa + "]";
	}

}
