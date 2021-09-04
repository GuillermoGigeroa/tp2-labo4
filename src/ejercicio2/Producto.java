package ejercicio2;

public abstract class Producto {
	private String fechaCaducidad;
	private String numeroLote;
	
	// Constructor
	public Producto(String fechaCaducidad, String numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	// Getters & Setters
	protected String getFechaCaducidad() {
		return fechaCaducidad;
	}
	protected void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	protected String getNumeroLote() {
		return numeroLote;
	}

	protected void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	// Métodos de la clase
	@Override
	public String toString() {
		return "Fecha de caducidad: " + fechaCaducidad + "\nNumero de lote: " + numeroLote + "\n";
	}
}
