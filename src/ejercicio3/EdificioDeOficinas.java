package ejercicio3;

public class EdificioDeOficinas implements Edificio{
	private int superficieEdificio;
	private int numeroDeOficinas;
	
	public EdificioDeOficinas(int superficieEdificio, int numeroDeOficinas) {
		this.superficieEdificio = superficieEdificio;
		this.numeroDeOficinas = numeroDeOficinas;
	}

	// Getters & Setters
	protected int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	protected void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	@Override
	public int getSuperficieEdificio() {
		return superficieEdificio;
	}
	
	protected void setSuperficieEdificio(int superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return "Edificio de Oficinas"
				+"\nSuperficie: " + superficieEdificio
				+ "\nNumeroDeOficinas: " + numeroDeOficinas
				+ "\n";
	}

}
