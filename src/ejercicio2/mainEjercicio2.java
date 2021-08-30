package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>(3);
		productos.add(new ProductoFresco("15/09/2021",659,"12/02/2021","Argentina"));
		productos.add(new ProductoRefrigerado("22/10/2021",659,2002));
		productos.add(new ProductoCongelado("23/12/2028",659,"0 grados"));
		
		Iterator<Producto> listaProductos = productos.iterator();
		while(listaProductos.hasNext()) {
			System.out.println(listaProductos.next().toString());
		}
	}

}
