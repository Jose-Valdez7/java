package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Producto insertado>>>"+producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Producto Actualizado>>>"+producto);
	}
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos(){
		ArrayList<Producto> productos=new ArrayList<Producto>();
		Categoria c=new Categoria(21,"Snack");
		Producto p=new Producto("01","Papas",c,0.60,12);
		productos.add(p);
		Categoria c1=new Categoria(20,"Dulces");
		Producto p1=new Producto("02","Manicho",c1,0.50,10);
		productos.add(p1);
		Categoria c2=new Categoria(22,"Bebida");
		Producto p2=new Producto("03","Gaseosa",c2,0.75,24);
		productos.add(p2);
		return productos;
	}
}
