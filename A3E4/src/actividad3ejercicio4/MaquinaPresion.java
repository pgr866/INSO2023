package actividad3ejercicio4;

import java.util.ArrayList;

public class MaquinaPresion {
	
	private int numCoches;
	private int numRuedas;
	
	private ArrayList<Coche> coches;
	private ArrayList<Rueda> ruedasAsignadas;
	
	public int getNumCoches() {
		return this.numCoches;
	}
	
	public int getNumRuedas() {
		return this.numRuedas;
	}
	
	public String asignarRuedas(String matricula) {
		
		String resultado = "Error";
		boolean encontrado = false;
		
		int numCoches = this.getNumCoches();
		for(int i=0; i<numCoches && encontrado==false; i++) {
			Coche cAux = coches.get(i);
			String mat = cAux.getMatricula();
			
			if(matricula.equals(mat)) {
				encontrado = true;
				ArrayList<Rueda> ruedas = cAux.getRuedas();
				this.ruedasAsignadas = ruedas;
				resultado = "Se han asignado correctamente las ruedas de la matrícula " + matricula;
			} else {
				resultado = "No se ha encontrado la matrícula " + matricula;
			}
		}
		return resultado;
	}
	
	public double inflarRuedas(double presionDelanteras, double presionTraseras) {
		
		double aireTotal = 0.0;
		
		double incremento = 0.1;
		
		int numRuedas = this.getNumRuedas();
		for(int i=0; i<numRuedas; i++) {
			Rueda rAux = ruedasAsignadas.get(i);
			double presionRueda = rAux.getPresion();
			TipoRueda tipoRueda = rAux.getTipoRueda();
			double diferencia = 0.0;
			
			if(tipoRueda.equals(TipoRueda.DELANTERA)) {
				diferencia = presionDelanteras - presionRueda;
			} else {
				diferencia = presionTraseras - presionRueda;
			}
			
			aireTotal+=diferencia;
			double presionNueva = presionRueda + diferencia;
		
			if(diferencia <= 0.3) {
				rAux.setPresion(presionNueva);
			} else {
				int pasos = (int) (diferencia/incremento);
		 		for(int j=0; j<pasos; j++) {
					presionNueva = presionRueda + incremento;
					rAux.setPresion(presionNueva);
				}
			}
		}
		return aireTotal;
	}
}
