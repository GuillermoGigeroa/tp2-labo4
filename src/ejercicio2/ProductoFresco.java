package ejercicio2;

public class ProductoFresco extends Producto{
	private String fechaEnvasado;
	private String paisOrigen;
	
	// Constructor
	public ProductoFresco(String fechaCaducidad, String numeroLote,
						  String fechaEnvasado, String paisOrigen)
	{
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	// Getters & Setters
	protected String getFechaEnvasado() {
		return fechaEnvasado;
	}
	protected void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	protected String getPaisOrigen() {
		return paisOrigen;
	}
	protected void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return super.toString()+"Fecha de envasado: "+ fechaEnvasado
				+ "\nPais de origen: " + paisOrigen + "\n";
	}
}
