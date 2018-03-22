package fpdual;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DocumentoPropuestaTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;
	private static final EstadoDocumento ESTADO = EstadoDocumento.ACTIVO;
	private static final Integer CODIGOPROPUESTA = 11;
	private static final Integer EJERCICIO = 2010;
	private static final String GRUPOPOLITICO = "PP";

	DocumentoPropuesta prueba;

	@Before
	public void InstanciasDeObjetos() {

		prueba = new DocumentoPropuesta(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO, ESTADO, CODIGOPROPUESTA, EJERCICIO,
				GRUPOPOLITICO);

	}

	@Test
	public final void testToString() {

		assertEquals(prueba.toString(), "Documento con código = " + CODIGO + "CodigoPropuesta = " + CODIGOPROPUESTA
				+ ", ejercicio = " + EJERCICIO + ", grupoPolitico = " + GRUPOPOLITICO);

	}

	@Test
	public final void testGetters() {

		assertEquals(prueba.getEjercicio(), EJERCICIO);
		assertEquals(prueba.getGrupoPolitico(), GRUPOPOLITICO);

	}

}