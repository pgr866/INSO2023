package actividad3ejercicio1;

public class Vehiculo {

	Plaza plaza;
	private String matricula;

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int obtenerPlaza() {
		return plaza.getNumPlaza();
	}
}
