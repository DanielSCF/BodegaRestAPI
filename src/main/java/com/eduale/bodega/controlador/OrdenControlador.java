package com.eduale.bodega.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.eduale.bodega.modelo.DetalleOrden;
import com.eduale.bodega.modelo.OrdenCompra;
import com.eduale.bodega.modelo.Producto;
import com.eduale.bodega.servicio.DetalleOrdenServicio;
import com.eduale.bodega.servicio.OrdenServicio;
import com.eduale.bodega.servicio.ProductoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orden")
public class OrdenControlador {
    @Autowired
	private OrdenServicio ordenService;

	@Autowired
	private DetalleOrdenServicio detalleOrdenServicio;
    
    @Autowired
	private ProductoServicio productoServicio;

	@GetMapping
	public List<OrdenCompra> listarOrden() {
		return ordenService.listarOrdenCompra();
	}

	@GetMapping(path = "/{id}")
	public Optional<OrdenCompra> buscarid(@PathVariable("id") Long id) {
		return ordenService.buscarid(id);
	}

	@PostMapping
	public OrdenCompra guardarOrden(@Valid @RequestBody OrdenCompra t) {
		return ordenService.guardarOrdenCompra(t);
	}

	@DeleteMapping
	public void eliminarOrden(@Valid @RequestBody OrdenCompra t) {
		ordenService.editarOrdenCompra(t);
	}

	@PutMapping
	public OrdenCompra editarOrden(@RequestBody OrdenCompra t){
		if(!(t.getEstado().equalsIgnoreCase("pendiente"))) {
			List<DetalleOrden> detalles = new ArrayList<>();
			detalles = (List<DetalleOrden>) detalleOrdenServicio.listarSegunOrdenId(t.getOrden_compraID());
			for(DetalleOrden detalleOrden : detalles) {
				Optional<Producto> producto = productoServicio.getProductById(detalleOrden.getProducto().getProductoid());
				producto.get().setStock(detalleOrden.getCantidad() + producto.get().getStock());
			}
		}
		
		return ordenService.guardarOrdenCompra(t);
	}
}
