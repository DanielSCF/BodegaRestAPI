package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Cliente;

import com.eduale.bodega.repositorio.ICliente;

@Service
public class ClienteServicio {

	@Autowired
	private ICliente datacliente;

	public List<Cliente> listarCliente() {
		return (List<Cliente>) datacliente.findAll();
	}

	public Optional<Cliente> buscarid(Long id) {
		return datacliente.findById(id);
	}

	public Cliente guardarCliente(Cliente u) {
		return datacliente.save(u);
	}

	public Cliente editarCliente(Cliente u) {
		return datacliente.save(u);
	}

	public void eliminarCliente(Cliente u) {
		datacliente.delete(u);
	}

	public boolean validarid(Long id) {
		Optional<Cliente> cod = datacliente.findById(id);
		if (cod.isPresent()) {
			return true;
		} else {
			return false;
		}
	}

	public Cliente buscarcliente(Long id) {
		return datacliente.findById(id).get();
	}
}
