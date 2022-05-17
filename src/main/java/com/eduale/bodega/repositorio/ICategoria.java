package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Categoria;

public interface ICategoria extends CrudRepository<Categoria, Long>{

}
