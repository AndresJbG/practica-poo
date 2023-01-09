package org.pg.datos;

import java.time.LocalDateTime;

public class Contratos {
	private LocalDateTime fecha;
	private Empleado empleado;
	private Empresa empresa;
	public Contratos(LocalDateTime fecha, Empleado empleado, Empresa empresa) {
		super();
		this.fecha = fecha;
		this.empleado = empleado;
		this.empresa = empresa;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
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
		return "Contratos [fecha=" + fecha + ", empleado=" + empleado + ", empresa=" + empresa + "]";
	}
	}


