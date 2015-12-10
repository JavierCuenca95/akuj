package org.Module1;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
	private long id;
	private List<Producto> Productos;
	private Servidor server;
	
	public Pedido(long id, List<Producto> Productos){
		this.id=id;
		this.Productos=Productos;
	}
	
	public void nuevoPedido(Pedido pedido){
		server.AniadirPedido(pedido);
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Producto> getProductos() {
		return Productos;
	}

	public void setProductos(List<Producto> productos) {
		Productos = productos;
	}

	public void AniadirProductoPed(Producto producto) {
		Productos.add(producto);
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", Productos=" + Productos + "]";
	}
	public void EliminarProductoPed(Producto producto) {
		int i=0;
		boolean continuar=true;
		do{
			Producto prod=Productos.get(i);
			if(prod.getNombre().equals(producto.getNombre())){
				Productos.remove(i);
				continuar=false;
			}else if(i==Productos.size()){
				System.out.println("Producto no encontrado");
				continuar=false;
			}else{
				i++;
			}
		}while(i<Productos.size() || continuar==false);
	}
}
