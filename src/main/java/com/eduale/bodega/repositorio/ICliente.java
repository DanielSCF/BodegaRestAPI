package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Cliente;

public interface ICliente extends CrudRepository<Cliente, Long>{

}
