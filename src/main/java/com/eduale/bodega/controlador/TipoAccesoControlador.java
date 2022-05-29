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

import com.eduale.bodega.modelo.TipoAcceso;
import com.eduale.bodega.servicio.TipoAccesoServicio;

@RestController
@RequestMapping("/tipoAcceso")
public class TipoAccesoControlador {
	
	@Autowired
	private TipoAccesoServicio tipoaccesoService;

	@GetMapping
	public List<TipoAcceso> listarTipoAcceso() {
		return tipoaccesoService.listarTipoAcceso();
	}

	@GetMapping(path = "/{id}")
	public Optional<TipoAcceso> buscarid(@PathVariable("id") Long id) {
		return tipoaccesoService.buscarid(id);
	}

	@PostMapping
	public TipoAcceso guardarTipoAcceso(@Valid @RequestBody TipoAcceso t) {
		return tipoaccesoService.guardarTipoAcceso(t);
	}

	@PutMapping
	public TipoAcceso editarTipoAcceso(@Valid @RequestBody TipoAcceso t) {
		return tipoaccesoService.editarTipoAcceso(t);	
	}

	@DeleteMapping
	public void eliminarTipoAcceso(@Valid @RequestBody TipoAcceso t) {
		tipoaccesoService.eliminarTipoAcceso(t);
	}
	 
}
