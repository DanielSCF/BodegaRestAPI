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

import com.eduale.bodega.modelo.Lote;
import com.eduale.bodega.servicio.LoteServicio;

@RestController
@RequestMapping("/lote")
public class LoteControlador {
	
	@Autowired
	private LoteServicio loteService;

	@GetMapping
	public List<Lote> listarLote() {
		return loteService.listarLote();
	}

	@GetMapping(path = "/{id}")
	public Optional<Lote> buscarid(@PathVariable("id") Long id) {
		return loteService.buscarid(id);
	}

	@PostMapping
	public Lote guardarLote(@Valid @RequestBody Lote t) {
		return loteService.guardarLote(t);
	}

	@PutMapping
	public Lote editarLote(@Valid @RequestBody Lote t) {
		return loteService.editarLote(t);	
	}

	@DeleteMapping
	public void eliminarLote(@Valid @RequestBody Lote t) {
		loteService.eliminarLote(t);
	}
}
