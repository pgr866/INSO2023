package actividad2ejercicio5;

public abstract class Robot extends NumeroDeSerie {

	private int numPiezas;
	private double precio;

	public abstract int getNumPiezas();

	public abstract void setNumPiezas(int numPiezas);

	public abstract double getPrecio();

	public abstract void setPrecio(double precio);
}
