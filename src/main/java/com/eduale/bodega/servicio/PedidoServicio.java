package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Pedido;
import com.eduale.bodega.repositorio.IPedido;

@Service
public class PedidoServicio {
	@Autowired
	private IPedido pedidodata;
	
	public List<Pedido> listarPedido(){
		return (List<Pedido>) pedidodata.findAll();
	}
	
	public Pedido guardarPedido(Pedido u) {
		return pedidodata.save(u);
	}
}
