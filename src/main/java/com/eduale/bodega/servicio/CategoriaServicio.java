package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Categoria;
import com.eduale.bodega.repositorio.ICategoria;

@Service
public class CategoriaServicio {
	
	@Autowired
	private ICategoria datacategoria;
	
	public List<Categoria> listarCategoria(){
		return (List<Categoria>) datacategoria.findAll();
	}
	
	public Categoria guardarCategoria(Categoria u) {
		return datacategoria.save(u);
		
	}
}
