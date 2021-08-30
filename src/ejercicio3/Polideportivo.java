package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva{
	private int superficieEdificio;
	private String nombre;
	private int tipoDeInstalacion;

	// Constructores
	public Polideportivo(int superficieEdificio, String nombre, int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficieEdificio = superficieEdificio;
		this.nombre = nombre;
	}
	
	// Getters & Setters
	@Override
	public int getSuperficieEdificio() {
		return superficieEdificio;
	}

	protected void setSuperficieEdificio(int superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}
	
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return "Polideportivo"
				+ "\nSuperficie: " + superficieEdificio 
				+ "\nNombre: " + nombre
				+ "\nTipoDeInstalacion: " + tipoDeInstalacion
				+ "\n";
	}
}
