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
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long proveedorID;
	
	private String nombre;
	private String razon_social;
	private String direccion;
	private String telefono;
	private String distrito;
	private String correo;
	
	@OneToMany(mappedBy ="proveedor")
	private Collection<OrdenCompra> p= new ArrayList<>();
	
	public Proveedor() {
		
	}

	public Proveedor(Long proveedorID, String nombre, String razon_social, String direccion, String telefono,
			String distrito, String correo) {
		super();
		this.proveedorID = proveedorID;
		this.nombre = nombre;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.telefono = telefono;
		this.distrito = distrito;
		this.correo = correo;
	}

	public Long getProveedorID() {
		return proveedorID;
	}

	public void setProveedorID(Long proveedorID) {
		this.proveedorID = proveedorID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
