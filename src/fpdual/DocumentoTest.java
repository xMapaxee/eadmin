package fpdual;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DocumentoTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;
	Documento prueba;

	@Before
	public void instanciarObjetos() {

		prueba = new Documento(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO, EstadoDocumento.ACTIVO);

	}

	@Test
	public final void testHashCode() {

		assertEquals(prueba.hashCode(), CODIGO.hashCode());

	}

	@Test
	public final void testGetters() {

		assertEquals(EstadoDocumento.ACTIVO, prueba.getEstado());

	}

	@Test
	public final void testToString() {

		assertEquals("Documento con código = 1", prueba.toString());

	}

}