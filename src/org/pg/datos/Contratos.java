package org.pg.datos;

public class Contratos {
	private Integer fechaCreacion;
	private Empleado empleado;
	private Empresa empresa;

	public Contratos(Integer fechaCreacion, Empleado empleado, Empresa empresa) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.empleado = empleado;
		this.empresa = empresa;
	}

	public Integer getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Integer fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Contratos [fechaCreacion=" + fechaCreacion + ", empleado=" + empleado + ", empresa=" + empresa + "]";
	}

}
