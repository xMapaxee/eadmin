package fpdual;

import java.util.Date;

public class Documento extends ModeloAdminElectronica {

	private EstadoDocumento estado;

	public Documento(Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado) {
		super(codigo, nombre, fechaCreacion, publico);
		this.estado = estado;
	}

	public EstadoDocumento getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Documento con código = " + codigo;
	}

}