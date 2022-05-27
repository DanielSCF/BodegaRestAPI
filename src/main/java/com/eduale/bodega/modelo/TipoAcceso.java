package com.eduale.bodega.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tipoAcceso")
public class TipoAcceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tipoAccesoID;
	
	@NotNull
	@Size(min = 1, max = 60, message = "El campo debe tener de 1 a 60 caracteres")
	@Column(unique = true)
	private String nombre;

	@NotNull
	@Size(min = 1, max = 100, message = "El campo debe tener de 1 a 100 caracteres")
	@Column
	private String descripcion;

	@NotNull
	@Size(min = 1, max = 20, message = "El campo debe tener de 1 a 20 caracteres")
	@Column
	private String estado;
	
	@OneToMany(mappedBy ="tipoAcceso")
	private Collection<Usuario> p= new ArrayList<>();
	
	public TipoAcceso(Long tipoAccesoID, String nombre, String descripcion, String estado) {
		this.tipoAccesoID = tipoAccesoID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
		
	public TipoAcceso() {

	}

	public Long getTipoAccesoID() {
		return tipoAccesoID;
	}

	public void setTipoAccesoID(Long tipoAccesoID) {
		this.tipoAccesoID = tipoAccesoID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
