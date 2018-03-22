package fpdual;

import java.util.Objects;

public class RepositorioDocumento {

	public Object getDocumentos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarDocumentos(Integer codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void altaDocumento(Documento d) {

		if (listaDocumentos.contains(d)) {
			throw new IllegalArguentException("El documento ya existe primo");
		}

		listaDocumentos.add(d);
	}

	@Override
	public void modificarDocumeno(Documento d) {

		if (listaDocumentos.contains(d)) {
			throw new IllegalArguentException("El documento no existe primo");
		}
		listaDocumentos.set(listaDocumentos.indexOf(d), d);

	}

	@Override
	public void eliminarDocumento(Integer codigo) {

		Documento documentoEncontrado = null;

		documentoEncontrado = listaDocumentos.stream().filter(d -> d.getCodigo().equals(codigo)).findFirst()
				.orElseGet(null);

		if (documentoEncontrado.isPresent())	{
			listaDocumentos.remove(documentEncotrado.get());
		}

	}

}
