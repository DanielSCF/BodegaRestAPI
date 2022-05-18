package com.eduale.bodega.servicio;

import java.util.List;

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
}
