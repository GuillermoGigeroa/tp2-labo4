package ejercicio2;

public class ProductoCongelado extends Producto{
	private String temperaturaCongelacion;
	
	// Constructor
	public ProductoCongelado(String fechaCaducidad, String numeroLote, String temperaturaCongelacion) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	// Getters & Setters
	protected String getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	protected void setTemperaturaCongelacion(String temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	// Métodos de la clase
	@Override
	public String toString() {
		return super.toString()+"Temperatura de congelacion: " + temperaturaCongelacion + "\n";
	}
	
	
}
