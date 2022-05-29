package com.eduale.bodega.repositorio;

import com.eduale.bodega.modelo.OrdenCompra;

import org.springframework.data.repository.CrudRepository;

public interface IOrden extends CrudRepository<OrdenCompra, Long>{

}

