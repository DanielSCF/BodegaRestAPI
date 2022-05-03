package com.eduale.bodega.modelo;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UsuarioID;
	
	private String Nickname;
	private String Clave;
	private String Estado;
	
	@OneToOne
	@JoinColumn(name="UsuarioID",nullable=false,unique=true,
	foreignKey= @ForeignKey(foreignKeyDefinition =
	"foreign key(UsuarioID) references Usuario"))
	private TipoAcceso tipoacceso;

	
	public Usuario(Long usuarioID, String nickname, String clave, String estado, TipoAcceso tipoacceso) {
		super();
		UsuarioID = usuarioID;
		Nickname = nickname;
		Clave = clave;
		Estado = estado;
		this.tipoacceso = tipoacceso;
	}

	public Long getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(Long usuarioID) {
		UsuarioID = usuarioID;
	}

	public String getNickname() {
		return Nickname;
	}

	public void setNickname(String nickname) {
		Nickname = nickname;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public TipoAcceso getTipoacceso() {
		return tipoacceso;
	}

	public void setTipoacceso(TipoAcceso tipoacceso) {
		this.tipoacceso = tipoacceso;
	}
	
	
}
