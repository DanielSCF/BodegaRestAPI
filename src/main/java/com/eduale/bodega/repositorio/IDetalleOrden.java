package com.eduale.bodega.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.eduale.bodega.modelo.DetalleOrden;

public interface IDetalleOrden extends CrudRepository<DetalleOrden, Long> {

    @Query(value = "SELECT * FROM detalle_orden WHERE orden_compraid = :id", nativeQuery = true)
	public List<DetalleOrden> detallesOrdenId(@Param("id") Long id);
	
}
