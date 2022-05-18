package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public List<Cliente> listarCliente(){
		return clienteService.listarCliente();
	}
	 
	@PostMapping()
	public Cliente guardarCliente(@RequestBody Cliente t) {
		return clienteService.guardarCliente(t);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Cliente> buscarid(@PathVariable("id") Long id){
		return clienteService.buscarid(id);
	}
}
