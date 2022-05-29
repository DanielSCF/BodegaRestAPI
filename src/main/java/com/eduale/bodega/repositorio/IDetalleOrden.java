package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.DetalleOrden;

public interface IDetalleOrden extends CrudRepository<DetalleOrden, Long> {
	
}
