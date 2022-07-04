package commerce.contenedores;

import enums.TipoContenedor;

public class Caja extends Contenedor{
	
	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto);
		// TODO Auto-generated constructor stub+
		this.ancho = ancho;
		this.largo = largo;
	}

	private int ancho;
	private int largo;
	
	
	@Override
	public TipoContenedor getTipo() {
		// TODO Auto-generated method stub
		return TipoContenedor.CAJA;
	}

	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return ancho * largo;
		
	}

}
