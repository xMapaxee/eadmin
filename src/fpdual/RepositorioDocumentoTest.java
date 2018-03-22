package fpdual;

import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class RepositorioDocumentoTest {

	private RepositorioDocumento repositorioDocumento;
	private static final Documento DOCUMENTO = new Documento(1, "nombre", new Date(), true, EstadoDocumento.ACTIVO);

	@Before
	public void inicializarEnCadaTest() {
		this.repositorioDocumento = new RepositorioDocumento();

	}

	@Test
	public void deberiaEliminarUnDocumento() {
		this.repositorioDocumento.getDocumentos().add(DOCUMENTO);
		this.repositorioDocumento.eliminarDocumentos(DOCUMENTO.getCodigo());

		assertTrue(this.repositorioDocumento.getDocumentos().isEmpty());

	}

}
