package actividad3ejercicio2;

import java.util.*;

public class Paquete {

	List<Articulo> articulos;
	private double peso;
	private boolean promo;
	private double precio;
	private int numArticulos;

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean getPromo() {
		return this.promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumArticulos() {
		return this.numArticulos;
	}

	public void setNumArticulos(int numArticulos) {
		this.numArticulos = numArticulos;
	}

	public double establecerPrecio(double valorPromo) {
		if (promo)
			setPrecio(valorPromo);
		else {
			double sum = 0;
			for (Articulo articulo : articulos)
				sum += articulo.getPrecio();
			if (peso > 20)	sum *= 2;
			setPrecio(sum);
		}
		return precio;
	}
}
