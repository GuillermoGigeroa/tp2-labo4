package ejercicio2;

public abstract class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	// Constructor
	public Producto(String fechaCaducidad, int numeroLote) {
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
	protected int getNumeroDeLote() {
		return numeroLote;
	}
	protected void setNumeroDeLote(int numeroDeLote) {
		this.numeroLote = numeroDeLote;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return "Fecha de caducidad: " + fechaCaducidad + "\nNumero de lote: " + numeroLote + "\n";
	}
}
