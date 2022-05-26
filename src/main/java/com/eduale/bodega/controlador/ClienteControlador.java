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

import com.eduale.bodega.modelo.Cliente;
import com.eduale.bodega.servicio.ClienteServicio;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

	@Autowired
	private ClienteServicio clienteService;

	@GetMapping
	public List<Cliente> listarCliente() {
		return clienteService.listarCliente();
	}

	@GetMapping(path = "/{id}")
	public Optional<Cliente> buscarid(@PathVariable("id") Long id) {
		return clienteService.buscarid(id);
	}

	@PostMapping
	public Cliente guardarCliente(@Valid @RequestBody Cliente t) {
		return clienteService.guardarCliente(t);
	}

	@PutMapping
	public Cliente editarCliente(@Valid @RequestBody Cliente t) {
		return clienteService.editarCliente(t);	
	}

	@DeleteMapping
	public void eliminarCliente(@Valid @RequestBody Cliente t) {
		clienteService.eliminarCliente(t);
	}

}
