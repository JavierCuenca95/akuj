package org.Module1;
import java.util.List;
import java.util.ArrayList;
import org.Module2.Cliente;
import org.Module3.Cocinero;
public class Servidor {
	
	private List<Cliente> clientes=new ArrayList();
	private List<Cocinero> cocineros=new ArrayList();
	private List<Pedido> pedidos=new ArrayList();
	private List<Producto> productos=new ArrayList();
	
	public boolean LoginCliente(String Usuario, String Contrasenia) {
		boolean correcto=false;
		int i=0;
		do{
			if(Usuario.equals(clientes.get(i).getUsuario())){
				if(Contrasenia.equals(clientes.get(i).getContrasenia())){
					correcto=true;
				}
			}else{
				i++;
			}
		}while(correcto==true|| i==clientes.size());
		return correcto;
	}
	public boolean LoginCocinero(String Usuario, String Contrasenia) {
		boolean correcto=false;
		int i=0;
		do{
			if(Usuario.equals(cocineros.get(i).getUsuario())){
				if(Contrasenia.equals(cocineros.get(i).getContrasenia())){
					correcto=true;
				}
			}else{
				i++;
			}
		}while(correcto==true|| i==clientes.size());
		return correcto;
	}
	public void RegistrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void RegistrarCocinero(Cocinero cocinero) {
		cocineros.add(cocinero);
	}

	public List<Producto> MostrarListaProductos() {
		return productos;
	}

	public void NuevoProducto(Producto producto) {
		productos.add(producto);
	}

	public boolean EliminarProducto(Producto producto) {
		boolean continuar=false;
		int i=0;
		do{
			if(producto.getNombre().equals(productos.get(i).getNombre())){
				continuar=true;
			}else{
				i++;
			}
		}while(continuar==true || i==pedidos.size());
		return continuar;
	}

	public Pedido ConfirmarPedido(Pedido pedido) {
		Pedido ped=null;
		boolean continuar=false;
		int i=0;
		do{
			if(pedido.getId()==pedidos.get(i).getId()){
				ped=pedidos.remove(i);
				continuar=true;
			}else{
				i++;
			}
		}while(continuar==true || i==pedidos.size());
		return ped;
	}
	
	public List<Pedido> MostrarPedidos() {
		return pedidos;
	}

	public boolean PedidoListo(Pedido pedido) {
		boolean continuar=false;
		int i=0;
		do{
			if(pedido.getId()==pedidos.get(i).getId()){
				continuar=true;
			}else{
				i++;
			}
		}while(continuar==true || i==pedidos.size());
		return continuar;
	}
	
	public void AniadirPedido(Pedido pedido){
		pedidos.add(pedido);
	}
}
