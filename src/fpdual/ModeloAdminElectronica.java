package fpdual;

import java.util.Date;

public abstract class ModeloAdminElectronica {

	protected Integer codigo;
	protected String nombre;
	protected Date fechaCreacion;
	protected Boolean publico;

	public ModeloAdminElectronica(Integer cod, String nomb, Date fechaCreacion, Boolean publico) {

		codigo = cod;
		nombre = nomb;
		this.fechaCreacion = fechaCreacion;
		this.publico = publico;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public Boolean getPublico() {
		return publico;
	}

	@Override
	public int hashCode() {
		return codigo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof ModeloAdminElectronica) {
			return codigo.equals(((ModeloAdminElectronica) obj).getCodigo());
		}
		return false;
	}

}