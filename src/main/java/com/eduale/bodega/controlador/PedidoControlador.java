package com.eduale.bodega.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.DetallePedido;
import com.eduale.bodega.modelo.Pedido;
import com.eduale.bodega.modelo.Producto;
import com.eduale.bodega.servicio.DetallePedidoServicio;
import com.eduale.bodega.servicio.PedidoServicio;
import com.eduale.bodega.servicio.ProductoServicio;

@RestController
@RequestMapping("/pedido")
public class PedidoControlador {
	@Autowired
	private PedidoServicio pedidoService;

	@Autowired
	private DetallePedidoServicio detallePedidoServicio;
	
	@Autowired
	private ProductoServicio productoServicio;

	@GetMapping
	public List<Pedido> listarPedido() {
		return pedidoService.listarPedido();
	}

	@GetMapping(path = "/{id}")
	public Optional<Pedido> buscarid(@PathVariable("id") Long id) {
		return pedidoService.buscarid(id);
	}

	@PostMapping
	public Pedido guardarPedido(@Valid @RequestBody Pedido t) {
		return pedidoService.guardarPedido(t);
	}

	@PutMapping
	public Pedido editarPedido(@RequestBody Pedido t){
		if(!(t.getEstado().equalsIgnoreCase("pendiente"))) {
			List<DetallePedido> detalles = new ArrayList<>();
			detalles = (List<DetallePedido>) detallePedidoServicio.listarSegunPedidoId(t.getPedidoID());
			
			for(DetallePedido detallePedido : detalles) {
				Optional<Producto> producto = productoServicio.getProductById(detallePedido.getProducto().getProductoid());
				
				
				Integer tempStock = producto.get().getStock() - detallePedido.getCantidad();
				
				if(tempStock < 0) {
					producto.get().setStock(0);
				}else {
					producto.get().setStock(producto.get().getStock() - detallePedido.getCantidad());
				}
			}
		}
		return pedidoService.guardarPedido(t);
	}

	@DeleteMapping
	public void eliminarPedido(@Valid @RequestBody Pedido t) {
		pedidoService.eliminarPedido(t);
	}
}
