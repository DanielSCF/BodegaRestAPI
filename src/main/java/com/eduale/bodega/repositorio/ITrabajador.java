package com.eduale.bodega.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

import com.eduale.bodega.modelo.Trabajador;

public interface ITrabajador extends CrudRepository <Trabajador, Long> {
    @Query(value = "SELECT * FROM trabajador WHERE cargo = 'almacenero' OR cargo = 'administrador'", nativeQuery = true)
	public Optional<List<Trabajador>> findWorkersOrder();
}
