package actividad3ejercicio3;

import java.util.*;

public class Escenario {

	Collection<Elemento> elementos;
	private int numElementos;

	public int getNumElementos() {
		return this.numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}

	public void inicializarEscenario(TipoEscenario tipo) {
		int arboles, piedras, aguas;
		switch (tipo) {
			case A:
				arboles = 100;
				piedras = 300;
				aguas = 0;
				break;
			case B:
				arboles = 50;
				piedras = 200;
				aguas = 100;
				break;
			case C:
				arboles = 0;
				piedras = 300;
				aguas = 500;
				break;
			default:
				arboles = 0;
				piedras = 0;
				aguas = 0;
		}
		for (int i=0; i<arboles; i++) {
			int posicionX = generarPosicion();
			int posicionY = generarPosicion();
			Arbol arbol = new Arbol();
			arbol.setPosX(posicionX);
			arbol.setPosY(posicionY);
			agregarElemento(arbol);
		}
		for (int i=0; i<piedras; i++) {
			int posicionX = generarPosicion();
			int posicionY = generarPosicion();
			Piedra piedra = new Piedra();
			piedra.setPosX(posicionX);
			piedra.setPosY(posicionY);
			agregarElemento(piedra);
		}
		for (int i=0; i<aguas; i++) {
			int posicionX = generarPosicion();
			int posicionY = generarPosicion();
			Agua agua = new Agua();
			agua.setPosX(posicionX);
			agua.setPosY(posicionY);
			agregarElemento(agua);
		}
	}

	public void agregarElemento(Elemento elemento) {
		throw new UnsupportedOperationException();
	}

	public int generarPosicion() {
		throw new UnsupportedOperationException();
	}
}
