package ejercicio1;

public class Empleado {
	private static int contador = 1000;
	private final int id;
	private String nombre;
	private int edad;

	// Constructores
	public Empleado() {
		this.id = contador;
		this.nombre = "Sin nombre";
		this.edad = 99;
		contador++;
	}

	public Empleado(String nombre, int edad) {
		this.id = contador;
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	// Metodos de la clase
	public static int devuelveProximoID() {
		return contador;
	}
	
	@Override
	public String toString() {
		return "ID del empleado: " + id + ", nombre: " + nombre + ", edad: " + edad + ", ";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	// Getters y Setters
	protected int getId() {
		return id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
}
