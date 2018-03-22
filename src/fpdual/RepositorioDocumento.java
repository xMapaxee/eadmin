package fpdual;

public interface RepositorioDocumento {

	public abstract void altaDocumento(Documento d);

	public abstract void modificarDocumento(Documento d);

	public abstract void eliminarDocumento(Integer codigo);

}