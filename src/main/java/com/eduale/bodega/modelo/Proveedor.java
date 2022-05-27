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
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long proveedorID;
	
	@NotNull
	@Column
	@Size(min = 1, max = 100, message = "El campo debe tener de 1 a 100 caracteres")
	private String nombre;

	@NotNull
	@Column
	@Size(min = 1, max = 10, message = "El campo debe tener de 1 a 10 caracteres")
	private String razon_social;

	@NotNull
	@Column
	@Size(min = 3, max = 100, message = "El campo debe tener de 3 a 100 caracteres")
	private String direccion;

	@NotNull
	@Column
	@Size(min = 8, max = 9, message = "El campo debe tener 9 caracteres")
	private String telefono;

	@NotNull
	@Column
	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	private String nombre_contacto;

	@NotNull
	@Column
	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	private String departamento;

	@NotNull
	@Column
	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	private String distrito;

	@NotNull
	@Column
	@Size(min = 3, max = 100, message = "El campo debe tener de 3 a 100 caracteres")
	private String correo;
	
	@OneToMany(mappedBy ="proveedor")
	private Collection<OrdenCompra> p= new ArrayList<>();
	
	public Proveedor() {
		
	}

	public Proveedor(Long proveedorID, String nombre, String razon_social, String direccion, String telefono, String nombre_contacto,String departamento,
			String distrito, String correo) {
		super();
		this.proveedorID = proveedorID;
		this.nombre = nombre;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre_contacto = nombre_contacto;
		this.departamento = departamento;
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

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
