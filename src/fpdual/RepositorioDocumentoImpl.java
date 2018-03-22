package fpdual;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioDocumentoImpl implements RepositorioDocumento {

	private List<Documento> listaDocumentos = new ArrayList<>();

	public List<Documento> getListaDocumentos() {
		return listaDocumentos;
	}

	@Override
	public void altaDocumento(Documento d) {

		if (listaDocumentos.contains(d)) {
			throw new IllegalArgumentException("El documento ya existe");
		}
		listaDocumentos.add(d);

	}

	@Override
	public void modificarDocumento(Documento d) {

		if (!listaDocumentos.contains(d)) {
			throw new IllegalArgumentException("El documento no existe");
		}
		listaDocumentos.set(listaDocumentos.indexOf(d), d);

	}

	@Override
	public void eliminarDocumento(Integer codigo) {

		Optional<Documento> documentoEncontrado = null;
		documentoEncontrado = listaDocumentos.stream().filter(d -> d.getCodigo().equals(codigo)).findFirst();

		if (documentoEncontrado.isPresent()) {
			listaDocumentos.remove(documentoEncontrado.get());
		}

	}

}