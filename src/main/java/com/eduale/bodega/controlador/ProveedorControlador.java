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

	@GetMapping(path = "/{id}")
	public Optional<Proveedor> buscarid(@PathVariable("id") Long id) {
		return proveedorService.buscarid(id);
	}
	 
	@PostMapping
	public Proveedor guardarProveedor(@Valid @RequestBody Proveedor t) {
		return proveedorService.guardarProveedor(t);
	}

	@PutMapping
	public Proveedor editarProveedor(@Valid @RequestBody Proveedor t) {
		return proveedorService.editarProveedor(t);	
	}

	@DeleteMapping
	public void eliminarProveedor(@Valid @RequestBody Proveedor t) {
		proveedorService.eliminarProveedor(t);
	}
}
