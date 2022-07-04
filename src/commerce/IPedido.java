package commerce;

import java.util.Set;

public interface IPedido {
	
	String getReferencia();
	
	Set<IProducto> getProductos();
	
	Set<IContenedor> getContenedores();
	
	void addContendor(IContenedor contendor);
	
	IContenedor addProducto(IProducto producto); 
	
	
}
