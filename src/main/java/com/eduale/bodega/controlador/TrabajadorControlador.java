package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.Trabajador;
import com.eduale.bodega.servicio.TrabajadorServicio;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorControlador {
	
	@Autowired
	private TrabajadorServicio trabajadorService;
	 
	@GetMapping
	public List<Trabajador> listarTrabajador(){
		return trabajadorService.listarTrabajador();
	}
	 
	@PostMapping()
	public Trabajador guardarTrabajador(@RequestBody Trabajador t) {
		return trabajadorService.guardarTrabajador(t);
	}
}
