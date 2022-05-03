package com.eduale.bodega.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoAcceso")
public class TipoAcceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long TipoAccesoID;
	
	private String Nombre;
	private String Descripcion;
	private String Estado;
	
	
	public TipoAcceso() {
		
	}


	public TipoAcceso(Long tipoAccesoID, String nombre, String descripcion, String estado) {
		TipoAccesoID = tipoAccesoID;
		Nombre = nombre;
		Descripcion = descripcion;
		Estado = estado;
	}


	public Long getTipoAccesoID() {
		return TipoAccesoID;
	}


	public void setTipoAccesoID(Long tipoAccesoID) {
		TipoAccesoID = tipoAccesoID;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public String getEstado() {
		return Estado;
	}


	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	
}
