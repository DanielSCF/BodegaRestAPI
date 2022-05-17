package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Proveedor;
import com.eduale.bodega.repositorio.IProveedor;

@Service
public class ProveedorServicio {
	@Autowired
	private IProveedor dataproveedor;
	
	public List<Proveedor> listarProveedor(){
		return(List<Proveedor>) dataproveedor.findAll();

	}
	
	public Proveedor guardarProveedor(Proveedor u) {
		return dataproveedor.save(u);
		
	}
}
