package com.eduale.bodega.controlador;

import java.util.List;

import com.eduale.bodega.modelo.OrdenCompra;
import com.eduale.bodega.servicio.OrdenServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping
	public List<OrdenCompra> listarOrden() {
		return ordenService.listarOrden();
	}

	@PostMapping
	public OrdenCompra guardarOrden(@RequestBody OrdenCompra t) {
		return ordenService.guardarOrden(t);
	}

	@PutMapping
	public OrdenCompra editarOrden(@RequestBody OrdenCompra t){
		return ordenService.guardarOrden(t);
	}
}
