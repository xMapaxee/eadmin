package fpdual;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ModeloAdminElectronicaTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;

	class ModeloAdminElectronicaFake extends ModeloAdminElectronica {

		public ModeloAdminElectronicaFake(Integer cod, String nomb, Date fechaCreacion, Boolean publico) {
			super(cod, nomb, fechaCreacion, publico);
		}

	}

	ModeloAdminElectronicaFake prueba, pruebaB;

	@Before
	public void instanciarObjetos() {

		prueba = new ModeloAdminElectronicaFake(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO);
		pruebaB = new ModeloAdminElectronicaFake(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO);

	}

	@Test
	public final void testHashCode() {

		assertEquals(prueba.hashCode(), CODIGO.hashCode());

	}

	@Test
	public final void testGetters() {

		assertEquals((int) prueba.getCodigo(), 1);
		assertEquals(prueba.getNombre(), "Nombre");
		assertEquals(prueba.getFechaCreacion(), FECHA_CREACION);
		assertEquals(prueba.getPublico(), true);

	}

	@Test
	public final void testEquals() {

		assertEquals(prueba.equals(pruebaB), true);
		assertEquals(pruebaB.equals("Hola"), false);

	}

}