package com.eduale.bodega.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long marcaID;
	
	private String nombre;
	private String estado;
	
	@OneToMany(mappedBy ="marca")
	private Collection<Producto> p1= new ArrayList<>();
	
	public Marca(Long marcaID, String nombre, String estado) {
		super();
		this.marcaID = marcaID;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Marca() {
		
	}


	public Long getMarcaID() {
		return marcaID;
	}


	public void setMarcaID(Long marcaID) {
		this.marcaID = marcaID;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
