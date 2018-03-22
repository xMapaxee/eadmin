package fpdual;

import java.util.Date;

public class DocumentoRegistro extends Documento {

	private String DNI_Interesado, codigoRegistro;

	public DocumentoRegistro(Integer codigo, String nombre, Date fechaCreacion, Boolean publico, EstadoDocumento estado,
			String DNI, String codigoReg) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.codigoRegistro = codigoReg;
		this.DNI_Interesado = DNI;

	}

	public String getDNI_Interesado() {
		return DNI_Interesado;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	@Override
	public String toString() {
		return super.toString() + "DNI_Interesado = " + DNI_Interesado + ", codigoRegistro = " + codigoRegistro;
	}

}