package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
	private String cargo;
	private int antiguedadDocente;

	// Constructores
	public Profesor() {
		super();
		cargo = "sin cargo";
		antiguedadDocente = 0;
	}

	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}

	// Metodos de la clase
	@Override
	public String toString() {
		return "ID: " + super.getId()
				+ ", Nombre: " + super.getNombre()
				+ ", Edad: " + super.getEdad()
				+ ", Cargo: " + cargo
				+ ", Antiguedad: " + antiguedadDocente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Profesor o) {
		if (this.hashCode() > o.hashCode()) {
			return 1;
		}
		if (this.hashCode() < o.hashCode()) {
			return -1;
		}
		return 0;
	}
	
	// Getters y Setters
	protected String getCargo() {
		return cargo;
	}

	protected void setCargo(String cargo) {
		this.cargo = cargo;
	}

	protected int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	protected void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

}
