package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Producto;
import com.eduale.bodega.repositorio.IProducto;

@Service
public class ProductoServicio {

	@Autowired
	private IProducto infoProducto;
	
	public List<Producto> listarProductos(){
		return (List<Producto>) infoProducto.findAll();
	}
	
	public Optional<Producto> getProductById(Long productoId){
		return infoProducto.findById(productoId);
	}
	
	public Optional<List<Producto>> buscarProductoNombre(String nombre) {
		return infoProducto.findBynombre(nombre);
	}

	public Producto guardarProducto(Producto u){
		return infoProducto.save(u);
	}

	public Producto editarProducto(Producto u) {
		return infoProducto.save(u);
	}
	
	public void eliminarProducto(Producto u) {
		infoProducto.delete(u);
	}
}
