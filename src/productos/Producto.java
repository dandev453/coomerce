package productos;

import commerce.IProducto;

public abstract class Producto implements IProducto{
	
	
	private String referencia;
	private int peso;
	private int volumen;
	private String categoria;
	
	


	public Producto(String referencia, int peso, int volumen) {
		this.referencia = referencia;
		this.peso = peso;
		this.volumen = volumen;
	}
	
	
	@Override
	public String getReferencia() {
		
		// TODO Auto-generated method stub
		return referencia;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return volumen;
	}

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return "";
	}

}
