package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Lote;
import com.eduale.bodega.repositorio.ILote;

@Service
public class LoteServicio {
	
	@Autowired
	private ILote datalote;

	public List<Lote> listarLote() {
		return (List<Lote>) datalote.findAll();
	}
	
	public Optional<Lote> buscarid(Long id) {
		return datalote.findById(id);
	}
	
	public Lote guardarLote(Lote u) {
		return datalote.save(u);
	}
	
	public Lote editarLote(Lote u) {
		return datalote.save(u);
	}
	
	public void eliminarLote(Lote u) {
		datalote.delete(u);
	}
}
