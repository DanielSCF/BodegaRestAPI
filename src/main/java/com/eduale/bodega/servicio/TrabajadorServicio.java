package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Trabajador;
import com.eduale.bodega.repositorio.ITrabajador;

@Service
public class TrabajadorServicio {
	
	@Autowired
	private ITrabajador datatrabajador;
	
	
	public List<Trabajador> listarTrabajador(){
		return(List<Trabajador>) datatrabajador.findAll();

	}
	
	public Trabajador guardarTrabajador(Trabajador u) {
		return datatrabajador.save(u);
		
	}

	public Optional<List<Trabajador>> listarAdminsAlmaceneros(){
		return datatrabajador.findWorkersOrder();
	}
}
