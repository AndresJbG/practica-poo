package org.pg.datos;

public class Direccion {
	private String calle;
	private Integer numero;
	private Integer codigoPostal;
	private String localidad;
	private String provincia;

	public Direccion(String calle, Integer numero, Integer codigoPostal, String localidad, String provincia) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", localidad="
				+ localidad + ", provincia=" + provincia + "]";
	}

}
