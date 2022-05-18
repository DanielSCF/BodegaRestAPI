package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.Producto;
import com.eduale.bodega.servicio.ProductoServicio;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@GetMapping
	public List<Producto> listarProductos(){
		return productoServicio.listarProductos();
	}
	
	@GetMapping(path = "/{productoId}")
	public Optional<Producto> findProductById(@PathVariable("productoId") Long productoId){
		return productoServicio.getProductById(productoId);
	}
	
	@GetMapping(path = "/buscar/{nombre}")
	public Optional<List<Producto>> buscarProductoNombre(@PathVariable("nombre") String nombre){
		return productoServicio.buscarProductoNombre(nombre);
	}

}
