package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Proveedor;
import com.eduale.bodega.repositorio.IProveedor;

@Service
public class ProveedorServicio {
	@Autowired
	private IProveedor dataproveedor;

	public List<Proveedor> listarProveedor() {
		return (List<Proveedor>) dataproveedor.findAll();
	}
	
	public Optional<Proveedor> buscarid(Long id) {
		return dataproveedor.findById(id);
	}
	
	public Proveedor guardarProveedor(Proveedor u) {
		return dataproveedor.save(u);
	}
	
	public Proveedor editarProveedor(Proveedor u) {
		return dataproveedor.save(u);
	}
	
	public void eliminarProveedor(Proveedor u) {
		dataproveedor.delete(u);
	}
}
