package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	 
	@PostMapping()
	public Marca guardarMarca(@RequestBody Marca t) {
		return marcaService.guardarMarca(t);
	}
}
