package ejercicio1;

import java.util.TreeSet;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void comparar(Profesor a, Profesor b) {
		Boolean igual = false;
		if (a.getNombre() == b.getNombre()) {
			if (a.getEdad() == b.getEdad()) {
				if (a.getCargo() == b.getCargo()) {
					if (a.getAntiguedadDocente() == b.getAntiguedadDocente()) {
						igual = true;
					}
				}
			}
		}
		if (igual) {
			System.out.println("Es el mismo profesor.");
		} else {
			System.out.println("No es el mismo profesor.");
		}
	}

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
		
		comparar(profesores[1], profesores[2]);
		comparar(profesores[3], profesores[4]);
	}
}
