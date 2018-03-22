package fpdual;

import static org.junit.Assert.*;
import java.util.Date;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Before;

public class DocumentoContableTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;
	private static final EstadoDocumento ESTADO = EstadoDocumento.ACTIVO;
	private static final BigDecimal IMPORTE = new BigDecimal(5000);
	private static final String DNIDEINTERESADO = "15404015F";
	DocumentoContable prueba;

	@Before
	public void InstanciasDeObjetos() {

		prueba = new DocumentoContable(CODIGO, NOMBRE, FECHA_CREACION, PUBLICO, ESTADO, IMPORTE, DNIDEINTERESADO);

	}

	@Test
	public final void testToString() {

		assertEquals(prueba.toString(),
				"Documento con código = " + CODIGO + " Importe = " + IMPORTE + " DNI_Interesado = " + DNIDEINTERESADO);

	}

	@Test
	public final void testGetters() {

		assertEquals(prueba.getImporte(), IMPORTE);
		assertEquals(prueba.getDNI_Interesado(), DNIDEINTERESADO);

	}

}