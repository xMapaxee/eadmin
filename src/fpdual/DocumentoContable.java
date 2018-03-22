package fpdual;

import java.math.BigDecimal;
import java.util.Date;

public class DocumentoContable extends Documento{
	
	private BigDecimal importe;
	private String DNI_Interesado ;

	public DocumentoContable(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, BigDecimal imp, String DNI) {
		
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.importe = imp;
		this.DNI_Interesado = DNI;
	}

	public BigDecimal getImporte() {
		
		return importe;
	}

	public String getDNI_Interesado() {
		
		return DNI_Interesado;
	}
	
	public String toString() {
		
		return super.toString() + " Importe = " + importe + " DNI_Interesado = " + DNI_Interesado;
		
	}
	
	
	
	
	
	
}