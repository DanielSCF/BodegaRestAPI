package com.eduale.bodega.servicio;

import java.util.List;

import com.eduale.bodega.modelo.OrdenCompra;
import com.eduale.bodega.repositorio.IOrden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServicio {
    @Autowired
	private IOrden ordendata;
	
	public List<OrdenCompra> listarOrden(){
		return (List<OrdenCompra>) ordendata.findAll();
	}
	
	public OrdenCompra guardarOrden(OrdenCompra u) {
		return ordendata.save(u);
	}
    
}
