package com.eduale.bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.modelo.Marca;
import com.eduale.bodega.repositorio.IMarca;



@Service
public class MarcaServicio {
	@Autowired
	private IMarca datamarca;
	
	public List<Marca> listarMarca(){
		return (List<Marca>) datamarca.findAll();
	}
	
	public Marca guardarMarca(Marca u) {
		return datamarca.save(u);
		
	}
}
