package commerce.contenedores;

import enums.TipoContenedor;

public abstract class Bolsa extends Contenedor{

	public Bolsa(String referencia2, int alto2) {
		super(referencia2, alto2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TipoContenedor getTipo() {
		// TODO Auto-generated method stub
		return TipoContenedor.BOLSA;
	}

	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		int radio = getDiametro()/2;
		return (int)(Math.PI * radio * radio);
	}

	protected abstract int getDiametro();

}
