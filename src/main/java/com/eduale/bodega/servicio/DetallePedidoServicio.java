package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.DetallePedido;
import com.eduale.bodega.repositorio.IDetallePedido;

@Service
public class DetallePedidoServicio {
	@Autowired
	private IDetallePedido detallepedido;
	
	public List<DetallePedido> listardetallepedido(){
		return (List<DetallePedido>) detallepedido.findAll();
	}
	
	public DetallePedido guardardetallepedido(DetallePedido u) {
		return detallepedido.save(u);
	}

	public Optional<List<DetallePedido>> findPedidoByCliente(Long clienteID) {
		return detallepedido.findPedidoByCliente(clienteID);
	}

	public Optional<List<DetallePedido>> findPedidoByClienteYEstado(Long clienteID, String estado){
		return detallepedido.findPedidoByClienteYEstado(clienteID, estado);
	}

	public DetallePedido editarDetallePedido(DetallePedido u) {
		return detallepedido.save(u);
	}
	
	public void eliminarDetallePedido(DetallePedido u) {
		detallepedido.delete(u);
	}

	public List<DetallePedido> listarSegunPedidoId(Long pedidoId){
    	return (List<DetallePedido>) detallepedido.detallesPedidoId(pedidoId);
    }

}
