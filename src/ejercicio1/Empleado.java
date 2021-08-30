package ejercicio1;

public class Empleado {
	private static int ultimoID = 1000;
	private final int id;
	private String nombre;
	private int edad;

	// Constructores
	public Empleado() {
		id = generarID();
		nombre = "sin nombre";
		edad = 99;
	}

	public Empleado(String nombre, int edad) {
		id = generarID();
		this.nombre = nombre;
		this.edad = edad;
	}

	// Métodos de la clase
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
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

	private int generarID() {
		int idGenerado = ultimoID;
		ultimoID++;
		return idGenerado;
	}

	public static int devuelveProximoID() {
		return ultimoID;
	}

	// Getters % Setters
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
