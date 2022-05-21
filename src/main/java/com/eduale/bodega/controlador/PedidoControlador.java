package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		public List<Pedido> listarPedido(){
			return pedidoService.listarPedido();
	}
	 
	 @PostMapping()
		public Pedido guardarPedido(@RequestBody Pedido t) {
			return pedidoService.guardarPedido(t);
	}
}
