package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public List<Categoria> listarCategoria(){
		return categoriaService.listarCategoria();
	}
	 
	@PostMapping()
	Categoria guardarCategoria(@RequestBody Categoria t) {
		return categoriaService.guardarCategoria(t);
	}
}
