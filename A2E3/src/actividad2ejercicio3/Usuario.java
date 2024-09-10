package actividad2ejercicio3;

public abstract class Usuario {

	protected int identificador;
	protected String contrasena;

	public abstract int getIdentificador();

	public abstract void setIdentificador(int identificador);

	public abstract String getContrasena();

	public abstract void setContrasena(String contrasena);

	public abstract void operarProducto();
}
