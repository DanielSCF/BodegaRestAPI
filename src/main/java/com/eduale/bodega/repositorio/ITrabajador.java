package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Trabajador;

public interface ITrabajador extends CrudRepository <Trabajador, Long> {

}
