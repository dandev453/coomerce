package commerce;

import java.util.Set;
import enums.TipoContenedor;
public interface IContenedor {
	
	String getReferencia();
	
	int getVolumen();
	
	int volumenDisponible();
	
	int getResistencia();
	
	Set<IProducto> getProductos();
	
	TipoContenedor getTipo();
	
	int getSuperficie();

}
