package Akuj_soft.PracticaMaven;

public class Cliente {
	private String nombre;
	private String contrasena;
	
	public Cliente(String n, String c){
		nombre=n;
		contrasena=c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", contasena=" + contrasena + "]";
	}
	
}
