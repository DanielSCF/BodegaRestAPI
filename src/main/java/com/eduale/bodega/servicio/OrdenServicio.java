package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import com.eduale.bodega.modelo.OrdenCompra;
import com.eduale.bodega.repositorio.IOrden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServicio {
    @Autowired
	private IOrden ordendata;

	public List<OrdenCompra> listarOrdenCompra() {
		return (List<OrdenCompra>) ordendata.findAll();
	}
	
	public Optional<OrdenCompra> buscarid(Long id) {
		return ordendata.findById(id);
	}
	
	public OrdenCompra guardarOrdenCompra(OrdenCompra u) {
		return ordendata.save(u);
	}
	
	public OrdenCompra editarOrdenCompra(OrdenCompra u) {
		return ordendata.save(u);
	}
	
	public void eliminarOrdenCompra(OrdenCompra u) {
		ordendata.delete(u);
	}
    
}
