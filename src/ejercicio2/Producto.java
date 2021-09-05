package ejercicio2;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechaCaducidad;
	private String numeroLote;
	
	// Constructores
	public Producto() {
		this.fechaCaducidad = LocalDate.now();
		this.numeroLote = "Sin definir";
	}
	
	public Producto(String fechaCaducidad, String numeroLote) {
		this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
		this.numeroLote = numeroLote;
	}

	// Metodos de la clase
	@Override
	public String toString() {
		return "Fecha de caducidad: " + fechaCaducidad
				+ "\nNumero de lote: " + numeroLote + "\n";
	}
	
	// Getters y Setters
	protected String getFechaCaducidad() {
		return fechaCaducidad.toString();
	}
	
	protected void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
	}
	
	protected String getNumeroLote() {
		return numeroLote;
	}

	protected void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

}
