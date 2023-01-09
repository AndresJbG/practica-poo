package org.pg.datos;

public class Empleado extends Persona {
	
	private Integer sueldo;
	private String categoria;
	private Direccion direccion;
	private Departamentos departamento;
	
	
	public Empleado(Integer dni, String nombre, Integer edad, String estado, Integer sueldo, String categoria,
			Direccion direccion, Departamentos departamento) {
		super(dni, nombre, edad, estado);
		this.sueldo = sueldo;
		this.categoria = categoria;
		this.direccion = direccion;
		this.departamento = departamento;
	}
	public double sueldoNeto(double descuento) {// descuento directamente el sueldo neto.
		double operacion =sueldo*( descuento/100);
		return this.sueldo-operacion;
	};
	
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Departamentos getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + ", direccion=" + direccion
				+ ", departamento=" + departamento + "]";
	}
}