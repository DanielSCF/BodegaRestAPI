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
@Table(name = "trabajador")
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trabajadorID;
	
	@NotNull
	@Size(min = 7, max = 8, message = "El campo debe tener 8 caracteres")
	@Column(unique = true)
	private String dni;

	@NotNull
	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	@Column
	private String nombre;

	@NotNull
	@Size(min = 3, max = 60, message = "El campo debe tener de 3 a 60 caracteres")
	@Column
	private String apellidos;

	@NotNull
	@Size(min = 5, max = 150, message = "El campo debe tener de 10 a 150 caracteres")
	@Column
	private String direccion;

	@NotNull
	@Size(min = 8, max = 9, message = "El campo debe tener 9 caracteres")
	@Column(unique = true)
	private String telefono;

	@NotNull
	@Size(min = 3, max = 50, message = "El campo debe tener de 3 a 50 caracteres")
	@Column
	private String cargo;

	
	@OneToMany(mappedBy ="trabajador")
	private Collection<Pedido> p1= new ArrayList<>();
	
	@OneToMany(mappedBy ="trabajador")
	private Collection<OrdenCompra> p= new ArrayList<>();
	
	public Trabajador() {
		
	}
	
	public Trabajador(Long trabajadorID, String nombre, String apellidos, String telefono, String dni, String direccion,
			String cargo) {
		super();
		this.trabajadorID = trabajadorID;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.direccion = direccion;
		this.cargo = cargo;
	}
	public Long getTrabajadorID() {
		return trabajadorID;
	}

	public void setTrabajadorID(Long trabajadorID) {
		this.trabajadorID = trabajadorID;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
