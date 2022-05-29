package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.TipoAcceso;
import com.eduale.bodega.repositorio.ITipoAcceso;

@Service
public class TipoAccesoServicio {

	@Autowired
	private ITipoAcceso datatipo;

	public List<TipoAcceso> listarTipoAcceso() {
		return (List<TipoAcceso>) datatipo.findAll();
	}

	public Optional<TipoAcceso> buscarid(Long id) {
		return datatipo.findById(id);
	}

	public TipoAcceso guardarTipoAcceso(TipoAcceso u) {
		return datatipo.save(u);
	}

	public TipoAcceso editarTipoAcceso(TipoAcceso u) {
		return datatipo.save(u);
	}

	public void eliminarTipoAcceso(TipoAcceso u) {
		datatipo.delete(u);
	}
}
