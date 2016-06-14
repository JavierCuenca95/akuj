package Akuj_soft.PracticaMaven;

public class Cocinero {
	private String id;
	private String contrasena;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	@Override
	public String toString() {
		return "Cocinero [id=" + id + ", contrasena=" + contrasena + "]";
	}
	public Cocinero(String id, String contrasena) {
		this.id = id;
		this.contrasena = contrasena;
	}
	
}
