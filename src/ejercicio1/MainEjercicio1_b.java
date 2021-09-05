package ejercicio1;

import java.util.TreeSet;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		Profesor profesores[] = new Profesor[5];
		profesores[0] = new Profesor();
		profesores[1] = new Profesor("Guille", 25, "Profe de matematicas", 6);
		profesores[2] = new Profesor("Roberto", 52, "Profe de laboratorio", 15);
		profesores[3] = new Profesor("Mariana", 42, "Profe de programacion", 8);
		profesores[4] = new Profesor("Mariana", 42, "Profe de programacion", 8);
		
		TreeSet<Profesor> listaProfes = new TreeSet<Profesor>();
		
		listaProfes.add(profesores[0]);
		listaProfes.add(profesores[1]);
		listaProfes.add(profesores[2]);
		listaProfes.add(profesores[3]);
		listaProfes.add(profesores[4]);
		
		Iterator<Profesor> profes = listaProfes.iterator();
		while (profes.hasNext()) {
			System.out.println(profes.next().toString());
		}
		
		if (profesores[3].equals(profesores[4])) {
			System.out.println("Es el mismo profesor.");
		} else {
			System.out.println("No es el mismo profesor.");
		}
		
		/*
		 * El resultado es que no es el mismo profesor porque tienen ID diferentes
		 * y esto afecta al .equals de la clase padre que compara los ID.
		 * En la siguiente parte del método equals:
		 * if (id != other.id)
		 * return false;
		 */
	}
}
