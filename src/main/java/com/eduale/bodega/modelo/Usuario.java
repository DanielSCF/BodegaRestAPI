package com.eduale.bodega.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuarioID;
	
	@NotNull
	@Size(min = 1, max = 60, message = "El campo debe tener de 1 a 60 caracteres")
	@Column(unique = true)
	private String nickname;

	@NotNull
	@Size(min = 1, max = 60, message = "El campo debe tener de 1 a 60 caracteres")
	@Column
	private String clave;

	@NotNull
	@Size(min = 1, max = 20, message = "El campo debe tener de 1 a 20 caracteres")
	@Column
	private String estado;

	
	@ManyToOne
	@JoinColumn(name="tipo_accesoid",nullable=true,unique=false,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(tipo_accesoid) references tipo_acceso(tipo_accesoid)"))
	private TipoAcceso tipoAcceso;
	
	@OneToOne
	@JoinColumn(name="clienteID",nullable=true,unique=false,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(clienteID) references cliente(clienteID)"))
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name="trabajadorID",nullable=true,unique=false,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(trabajadorID) references trabajador(trabajadorID)"))
	private Trabajador trabajador;
		
	public Usuario() {
		
	}
	
	public Usuario(Long usuarioID, String nickname, String clave, String estado, TipoAcceso tipoAcceso, Cliente cliente,
			Trabajador trabajador) {
		super();
		this.usuarioID = usuarioID;
		this.nickname = nickname;
		this.clave = clave;
		this.estado = estado;
		this.tipoAcceso = tipoAcceso;
		this.cliente = cliente;
		this.trabajador = trabajador;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(Long usuarioID) {
		this.usuarioID = usuarioID;
	}

	public TipoAcceso getTipoAcceso() {
		return tipoAcceso;
	}

	public void setTipoAcceso(TipoAcceso tipoAcceso) {
		this.tipoAcceso = tipoAcceso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}		
	
}
