package fpdual;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DocumentoRegistroTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;
	private static final EstadoDocumento ESTADO = EstadoDocumento.ACTIVO;
	private static final String CODIGOREGISTRO = "11235813";
	private static final String DNIDEINTERESADO = "15404015D";
	DocumentoRegistro prueba;

	@Before
	public void InstanciasDeObjetos() {

		prueba = new DocumentoRegistro(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO, ESTADO, DNIDEINTERESADO,
				CODIGOREGISTRO);

	}

	@Test
	public void testToString() {

		assertEquals(prueba.toString(), "Documento con código = " + CODIGO + "DNI_Interesado = " + DNIDEINTERESADO
				+ ", codigoRegistro = " + CODIGOREGISTRO);

	}

	@Test
	public void testGetters() {

		assertEquals(prueba.getCodigoRegistro(), CODIGOREGISTRO);
		assertEquals(prueba.getDNI_Interesado(), DNIDEINTERESADO);

	}

}