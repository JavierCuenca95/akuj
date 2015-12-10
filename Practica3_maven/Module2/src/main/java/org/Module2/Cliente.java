package org.Module2;

import org.Module1.Servidor;
import org.Module1.Producto;
import org.Module1.Pedido;
import java.util.List;
public class Cliente {

	private String Usuario;
	private String Contrasenia;
	private Servidor server;
	private Pedido per;
	public Cliente(String usuario, String contrasenia){
		Usuario=usuario;
		Contrasenia=contrasenia;
	}
	public void Login(String Usu, String Contra) {
		boolean si=server.LoginCliente(Usu, Contra);
		if(si==true){
			System.out.println("Login correcto");
		}else{
			System.out.println("Usuario o contraseña incorrecto");
		}
	}

	public void Registrar(String Usu, String Contra){
		Cliente cliente=new Cliente(Usu, Contra);
		server.RegistrarCliente(cliente);
		System.out.println("Registro Completado");
	}

	public void AniadirProduct(Producto producto) {
		per.AniadirProductoPed(producto);
	}

	public void EliminarProduct(Producto producto) {
		per.EliminarProductoPed(producto);
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public List<Producto> MostarListaProductos() {
		return server.MostrarListaProductos();
	}

	public void ConfirmarPedid(Pedido pedido) {
		server.ConfirmarPedido(pedido);
	}
}
