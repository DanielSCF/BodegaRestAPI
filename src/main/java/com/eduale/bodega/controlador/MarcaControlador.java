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

import com.eduale.bodega.modelo.Marca;
import com.eduale.bodega.servicio.MarcaServicio;

@RestController
@RequestMapping("/marca")
public class MarcaControlador {

	@Autowired
	private MarcaServicio marcaService;
	 
	@GetMapping
	public List<Marca> listaMarca(){
		return marcaService.listarMarca();
	}

	@GetMapping(path = "/{id}")
	public Optional<Marca> buscarid(@PathVariable("id") Long id) {
		return marcaService.buscarid(id);
	}
	 
	@PostMapping
	public Marca guardarMarca(@Valid @RequestBody Marca t) {
		return marcaService.guardarMarca(t);
	}

	@PutMapping
	public Marca editarMarca(@Valid @RequestBody Marca t) {
		return marcaService.editarMarca(t);
	}
	
	@DeleteMapping
	public void eliminarMarca(@Valid @RequestBody Marca t) {
		marcaService.eliminarMarca(t);
	}
}
