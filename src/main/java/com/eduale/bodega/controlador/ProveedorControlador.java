package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.Proveedor;
import com.eduale.bodega.servicio.ProveedorServicio;

@RestController
@RequestMapping("/proveedor")
public class ProveedorControlador {
	
	@Autowired
	private ProveedorServicio proveedorService;
	 
	@GetMapping
	public List<Proveedor> listarProveedor(){
		return proveedorService.listarProveedor();
	}
	 
	@PostMapping()
	public Proveedor guardarProveedor(@RequestBody Proveedor t) {
		return proveedorService.guardarProveedor(t);
	}
}
