package ejercicio2;

public class ProductoRefrigerado extends Producto{
	private int codigoOrganismo;

	// Constructores
	public ProductoRefrigerado() {
		super();
		this.codigoOrganismo = -1;
	}
	
	public ProductoRefrigerado(String fechaCaducidad, String numeroLote, int codigoOrganismo) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismo = codigoOrganismo;
	}

	// Getters & Setters
	protected int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	protected void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	// Métodos de la clase
	@Override
	public String toString() {
		return super.toString() + "Codigo de organismo: " + codigoOrganismo + "\n";
	}
	
}
