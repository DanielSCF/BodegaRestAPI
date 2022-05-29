package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Pedido;
import com.eduale.bodega.repositorio.IPedido;

@Service
public class PedidoServicio {
	@Autowired
	private IPedido datapedido;

	public List<Pedido> listarPedido() {
		return (List<Pedido>) datapedido.findAll();
	}
	
	public Optional<Pedido> buscarid(Long id) {
		return datapedido.findById(id);
	}
	
	public Pedido guardarPedido(Pedido u) {
		return datapedido.save(u);
	}
	
	public Pedido editarPedido(Pedido u) {
		return datapedido.save(u);
	}
	
	public void eliminarPedido(Pedido u) {
		datapedido.delete(u);
	}
}
