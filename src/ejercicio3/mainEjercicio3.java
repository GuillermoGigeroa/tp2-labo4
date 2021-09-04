package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
			ArrayList<Edificio> lista = new ArrayList<Edificio>(5);
			lista.add(new Polideportivo(50, "Don Miguel", 1));
			lista.add(new Polideportivo(42, "Boca Jrs", 2));
			lista.add(new Polideportivo(25, "La chiquita", 3));
			lista.add(new EdificioDeOficinas(70, 80));
			lista.add(new EdificioDeOficinas(100, 200));
			
			Iterator<Edificio> it = lista.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
	}

}
