package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Pedido;

public interface IPedido extends CrudRepository<Pedido, Long>{

}
