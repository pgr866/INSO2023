package actividad3ejercicio1;

import java.util.*;

public class Parking {

	List<Vehiculo> vehiculos;
	List<Plaza> plazas;
	private int numVehiculos;
	private int numPlazas;

	public int getNumVehiculos() {
		return this.numVehiculos;
	}

	public void setNumVehiculos(int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}

	public int getNumPlazas() {
		return this.numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String localizarVehiculo(String mat) {
		String resultado = "No se ha localizado su vehículo";
		int totCoches = getNumVehiculos();
		boolean encontrado = false;
		for (int i=0; !encontrado && i<totCoches; i++) {
			String matricula = vehiculos.get(i).getMatricula();
			if (mat == matricula) {
				encontrado = true;
				int numPlaza = vehiculos.get(i).obtenerPlaza();
				resultado = "Su vehículo se encuentra en la plaza " + numPlaza;
			}
		}
		return resultado;
	}
}
