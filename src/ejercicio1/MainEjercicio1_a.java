package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> listaProfes = new ArrayList<Profesor>(5);
		
		Profesor paulina = new Profesor();
		paulina.setNombre("Paulina");
		paulina.setEdad(26);
		paulina.setCargo("Area matem�ticas");
		paulina.setAntiguedadDocente(3);
		
		Profesor gael = new Profesor();
		gael.setNombre("Gael");
		gael.setEdad(38);
		gael.setCargo("Area biolog�a");
		gael.setAntiguedadDocente(12);
		
		listaProfes.add(new Profesor());
		listaProfes.add(new Profesor("Guille", 25, "Profe de programaci�n", 6));
		listaProfes.add(new Profesor("Roberto", 52, "Profe de laboratorio", 15));
		listaProfes.add(gael);
		listaProfes.add(paulina);
		
		Iterator<Profesor> profes = listaProfes.iterator();
		while (profes.hasNext()) {
			System.out.println(profes.next().toString());
		}
	}

}
