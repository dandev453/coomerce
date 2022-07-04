package commerce.contenedores;

import java.util.Set;

import commerce.IContenedor;
import commerce.IProducto;

public abstract class Contenedor implements IContenedor {

	private String referencia;
	private int alto;
	public Contenedor(String referencia2, int alto2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getReferencia() {
		// TODO Auto-generated method stub
		return referencia;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return alto * getSuperficie();
	}

	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResistencia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<IProducto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
