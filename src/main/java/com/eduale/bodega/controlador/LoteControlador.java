package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.Lote;
import com.eduale.bodega.servicio.LoteServicio;

@RestController
@RequestMapping("/lote")
public class LoteControlador {
	
	@Autowired
	private LoteServicio loteService;
	 
	@GetMapping
	public List<Lote> listaLote(){
		return loteService.listarLote();
	}
	 
	@PostMapping()
	public Lote guardarLote(@RequestBody Lote t) {
		return loteService.guardarLote(t);
	}
}
