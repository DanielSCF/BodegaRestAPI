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
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoriaID;
	
	@NotNull
	@Size(min = 1, max = 60, message = "El campo debe tener de 1 a 60 caracteres")
	@Column(unique = true)
	private String nombre;

	@NotNull
	@Size(min = 1, max = 20, message = "El campo debe tener de 1 a 20 caracteres")
	@Column
	private String estado;

	
	public Categoria() {
		
	}
	@OneToMany(mappedBy ="categoria")
	private Collection<Producto> p= new ArrayList<>();
	
	public Categoria(Long categoriaID, String nombre, String estado) {
		super();
		this.categoriaID = categoriaID;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Long getCategoriaID() {
		return categoriaID;
	}
	public void setCategoriaID(Long categoriaID) {
		this.categoriaID = categoriaID;
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
