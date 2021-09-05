package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>(3);
		
		Producto pFresco = new ProductoFresco("2021-12-13","905D632L","2021-08-30","Uruguay");
		Producto pRefrigerado = new ProductoRefrigerado("2022-09-15","AF32",2002);

		productos.add(pFresco);
		productos.add(pRefrigerado);
		productos.add(new ProductoCongelado("2028-12-23","JK03","-9 grados celsius"));
		
		Iterator<Producto> listaProductos = productos.iterator();
		while(listaProductos.hasNext()) {
			System.out.println(listaProductos.next().toString());
		}
	}
}
