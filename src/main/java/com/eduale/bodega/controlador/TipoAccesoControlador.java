package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.TipoAcceso;
import com.eduale.bodega.servicio.TipoAccesoServicio;

@RestController
@RequestMapping("/tipoAcceso")
public class TipoAccesoControlador {
	
	@Autowired
	private TipoAccesoServicio tipoAccesoService;
	 
	@GetMapping
	public List<TipoAcceso> listartipoacceso(){
		return tipoAccesoService.listartipoacceso();
	}
	 
	@PostMapping()
	public TipoAcceso guardartipoacceso(@RequestBody TipoAcceso t) {
		return tipoAccesoService.guardartipoacceso(t);
	}
	 
}
