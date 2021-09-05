package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva{
	private double superficieEdificio;
	private String nombre;
	private int tipoDeInstalacion;

	// Constructores
	public Polideportivo() {
		this.tipoDeInstalacion = 0;
		this.superficieEdificio = 0;
		this.nombre = "Sin nombre";
	}
	
	public Polideportivo(int superficieEdificio, String nombre, int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficieEdificio = superficieEdificio;
		this.nombre = nombre;
	}
	
	// Metodos de la clase
	@Override
	public String toString() {
		return "Polideportivo"
				+ "\nSuperficie: " + superficieEdificio 
				+ "\nNombre: " + nombre
				+ "\nTipoDeInstalacion: " + tipoDeInstalacion
				+ "\n";
	}
	
	// Getters y Setters
	@Override
	public double getSuperficieEdificio() {
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
	
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}
	
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
}
