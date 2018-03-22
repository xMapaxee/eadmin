package fpdual;

import java.util.Date;

public class DocumentoPropuesta extends Documento {

	private Integer codigoPropuesta;
	private Integer ejercicio;
	private String grupoPolitico;

	public DocumentoPropuesta(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, Integer codigoProp, Integer ejercicio, String grupoPol) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.codigoPropuesta = codigoProp;
		this.ejercicio = ejercicio;
		this.grupoPolitico = grupoPol;
	}

	public Integer getCodigoPropuesta() {
		return codigoPropuesta;
	}

	public Integer getEjercicio() {
		return ejercicio;
	}

	public String getGrupoPolitico() {
		return grupoPolitico;
	}

	@Override
	public String toString() {
		return super.toString() + "CodigoPropuesta = " + codigoPropuesta + ", ejercicio = " + ejercicio
				+ ", grupoPolitico = " + grupoPolitico;
	}

}