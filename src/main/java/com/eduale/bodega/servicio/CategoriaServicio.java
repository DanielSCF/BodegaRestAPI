package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Categoria> buscarid(Long id) {
		return datacategoria.findById(id);
	}
	
	public Categoria guardarCategoria(Categoria u) {
		return datacategoria.save(u);
	}

	public Categoria editarCategoria(Categoria u) {
		return datacategoria.save(u);
	}

	public void eliminarCategoria(Categoria u){
		datacategoria.delete(u);
	}

}
