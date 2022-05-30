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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteID;

	@Size(min = 7, max = 8, message = "El campo debe tener 8 caracteres")
	@Column(unique = true)
	private String dni;

	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	@Column
	private String nombre;

	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	@Column
	private String apellidos;

	@Size(min = 5, max = 150, message = "El campo debe tener de 10 a 150 caracteres")
	@Column
	private String direccion;

	@Size(min = 8, max = 9, message = "El campo debe tener 9 caracteres")
	@Column(unique = true)
	private String telefono;

	@OneToMany(mappedBy = "cliente")
	private Collection<Pedido> p1 = new ArrayList<>();

	public Cliente() {

	}

	public Cliente(Long clienteID, String dni, String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.clienteID = clienteID;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Long getClienteID() {
		return clienteID;
	}

	public void setClienteID(Long clienteID) {
		this.clienteID = clienteID;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
}
