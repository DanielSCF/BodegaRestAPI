package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.TipoAcceso;
import com.eduale.bodega.repositorio.ITipoAcceso;


@Service
public class TipoAccesoServicio {
	
	@Autowired
	private ITipoAcceso datatipo;
	
	public List<TipoAcceso> listartipoacceso(){
		return(List<TipoAcceso>) datatipo.findAll();

	}
	
	public TipoAcceso guardartipoacceso(TipoAcceso u) {
		return datatipo.save(u);
		
	}
	
	
}
