package com.eduale.bodega.controlador;

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

import com.eduale.bodega.modelo.Pedido;
import com.eduale.bodega.servicio.PedidoServicio;

@RestController
@RequestMapping("/pedido")
public class PedidoControlador {
	@Autowired
	private PedidoServicio pedidoService;

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
	public Pedido editarPedido(@Valid @RequestBody Pedido t) {
		return pedidoService.editarPedido(t);	
	}

	@DeleteMapping
	public void eliminarPedido(@Valid @RequestBody Pedido t) {
		pedidoService.eliminarPedido(t);
	}
}
