package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProfes = new ArrayList<Profesor>(5);
		listaProfes.add(new Profesor());
		listaProfes.add(new Profesor("Guille", 25, "Profe de matematicas", 6));
		listaProfes.add(new Profesor("Roberto", 52, "Profe de laboratorio", 15));
		listaProfes.add(new Profesor());
		listaProfes.add(new Profesor("Mariana", 42, "Profe de programacion", 8));
		Iterator<Profesor> profes = listaProfes.iterator();
		while (profes.hasNext()) {
			System.out.println(profes.next().toString());
		}
	}

}
