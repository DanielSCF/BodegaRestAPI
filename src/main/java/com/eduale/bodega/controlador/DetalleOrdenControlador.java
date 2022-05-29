package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.DetalleOrden;
import com.eduale.bodega.servicio.DetalleOrdenServicio;

@RestController
@RequestMapping("/detalleorden")
public class DetalleOrdenControlador {
    @Autowired
    private DetalleOrdenServicio detalleordenservicio;

    @GetMapping
    public List<DetalleOrden> listaOrden(){
        return detalleordenservicio.listarDetalleOrden();
    }

    @PostMapping
    public DetalleOrden guardarOrden(@Valid @RequestBody DetalleOrden t){
        return detalleordenservicio.guardarDetalleOrden(t);
    }

    @PutMapping
	public DetalleOrden editarDetalleOrden(@Valid @RequestBody DetalleOrden t) {
		return detalleordenservicio.editarDetalleOrden(t);	
	}

	@DeleteMapping
	public void eliminarDetalleOrden(@Valid @RequestBody DetalleOrden t) {
		detalleordenservicio.eliminarDetalleOrden(t);
	}
}
