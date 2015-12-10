package org.Module1;

public class Producto {
	private String Nombre;
	private double Precico;
	private Servidor server;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecico() {
		return Precico;
	}
	public void setPrecico(double precico) {
		Precico = precico;
	}
	public void Nuevo(Producto producto) {
		server.NuevoProducto(producto);
		System.out.println("Producto creado y añadidio correctamente");
		
	}
	public void Borrar(Producto producto) {
		boolean si=server.EliminarProducto(producto);
		if(si==true){
			System.out.println("Producto eliminado correctamente");
		}else{
			System.out.println("No se ha podido eliminar el producto");
		}
	}
	
	public String toString(){
		return "Producto: "+Nombre+" Precio:"+Precico;
	}
}
