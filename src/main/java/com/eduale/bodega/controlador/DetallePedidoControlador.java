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

import com.eduale.bodega.modelo.DetallePedido;
import com.eduale.bodega.servicio.DetallePedidoServicio;


@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoControlador {
	@Autowired
	private DetallePedidoServicio detallepedidoservicio;
	 
	@GetMapping
	public List<DetallePedido> listarDetallePedido() {
		return detallepedidoservicio.listardetallepedido();
	}

    @GetMapping(path = "/{clienteID}")
    public Optional<List<DetallePedido>> findPedidoByCliente(@PathVariable("clienteID") Long clienteID){
        return detallepedidoservicio.findPedidoByCliente(clienteID);
    }

    @GetMapping(path = "/{clienteID}/{estado}")
    public Optional<List<DetallePedido>> findPedidoByClienteYEstado(@PathVariable("clienteID") Long clienteID, @PathVariable("estado") String estado){
        return detallepedidoservicio.findPedidoByClienteYEstado(clienteID, estado);
    }
	 
	@PostMapping
	public DetallePedido guardarDetallePedido(@Valid @RequestBody DetallePedido t) {
		return detallepedidoservicio.guardardetallepedido(t);
	}

    @PutMapping
	public DetallePedido editarDetallePedido(@Valid @RequestBody DetallePedido t) {
		return detallepedidoservicio.editarDetallePedido(t);	
	}

	@DeleteMapping
	public void eliminarDetallePedido(@Valid @RequestBody DetallePedido t) {
		detallepedidoservicio.eliminarDetallePedido(t);
	}
}

