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

import com.eduale.bodega.modelo.Categoria;
import com.eduale.bodega.servicio.CategoriaServicio;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {
	
	@Autowired
	private CategoriaServicio categoriaService;

	@GetMapping
	public List<Categoria> listarCategoria() {
		return categoriaService.listarCategoria();
	}

	@GetMapping(path = "/{id}")
	public Optional<Categoria> buscarid(@PathVariable("id") Long id) {
		return categoriaService.buscarid(id);
	}
	 
	@PostMapping
	public Categoria guardarCategoria(@Valid @RequestBody Categoria t) {
		return categoriaService.guardarCategoria(t);
	}

	@PutMapping
	public Categoria editarCategoria(@Valid @RequestBody Categoria t) {
		return categoriaService.editarCategoria(t);	
	}

	@DeleteMapping
	public void eliminarCategoria(@Valid @RequestBody Categoria t) {
		categoriaService.eliminarCategoria(t);
	}
}
