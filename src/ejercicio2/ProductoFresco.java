package ejercicio2;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	// Constructor
	public ProductoFresco(String fechaCaducidad, String numeroLote,
						  String fechaEnvasado, String paisOrigen)
	{
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
		this.paisOrigen = paisOrigen;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return super.toString()+"Fecha de envasado: "+ fechaEnvasado
				+ "\nPais de origen: " + paisOrigen + "\n";
	}
	
	// Getters y Setters
	protected String getFechaEnvasado() {
		return fechaEnvasado.toString();
	}
	protected void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = LocalDate.parse(fechaEnvasado);
	}
	protected String getPaisOrigen() {
		return paisOrigen;
	}
	protected void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
}
