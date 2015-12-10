package org.Module3;
import java.util.List;
import java.util.ArrayList;
import org.Module1.Servidor;
import org.Module1.Pedido;
import org.Module1.Producto;

public class Cocinero {
	private String Usuario;
	private String Contrasenia;
	private Servidor server;
	
	public Cocinero(String usuario, String contrasenia){
		Usuario=usuario;
		Contrasenia=contrasenia;
	}
	public void Registrarse(String Usu, String Contra){
		Cocinero cocinero=new Cocinero(Usu, Contra);
		server.RegistrarCocinero(cocinero);
		System.out.println("Registro completado");
		
	}
	public void Login(String Usu, String Contra) {
		boolean si=server.LoginCocinero(Usu, Contra);
		if(si==true){
			System.out.println("Login correcto");
		}else{
			System.out.println("Usuario o contraseña incorrecto");
		}
	}

	public List<Pedido> MostrarPedidos() {
		return server.MostrarPedidos();
	}

	public void PedidoListo(Pedido pedido) {
		server.PedidoListo(pedido);
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

}
