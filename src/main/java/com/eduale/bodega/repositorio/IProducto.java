package com.eduale.bodega.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Producto;

public interface IProducto extends CrudRepository<Producto, Long>{
	
	Optional<List<Producto>> findBynombre(String nombre);
}
