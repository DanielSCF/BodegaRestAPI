package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public List<Trabajador> listarTrabajador() {
		return trabajadorService.listarTrabajador();
	}
	
	@GetMapping(path = "/adminsalmaceneros")
	public Optional<List<Trabajador>> listarAdminsAlmaceneros(){
		return trabajadorService.listarAdminsAlmaceneros();
	}

	@PostMapping
	public Trabajador guardarTrabajador(@Valid @RequestBody Trabajador t) {
		return trabajadorService.guardarTrabajador(t);
	}

	@PutMapping
	public Trabajador editarTrabajador(@Valid @RequestBody Trabajador t) {
		return trabajadorService.editarTrabajador(t);	
	}

	@DeleteMapping
	public void eliminarTrabajador(@Valid @RequestBody Trabajador t) {
		trabajadorService.eliminarTrabajador(t);
	}
}
