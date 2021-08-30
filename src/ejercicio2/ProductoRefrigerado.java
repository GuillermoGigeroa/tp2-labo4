package ejercicio2;

public class ProductoRefrigerado extends Producto{
	private int codigoOrganismo;

	// Constructor
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codigoOrganismo) {
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

	// M�todos de la clase
	@Override
	public String toString() {
		return super.toString()+"Codigo de organismo: " + codigoOrganismo + "\n";
	}
	
}