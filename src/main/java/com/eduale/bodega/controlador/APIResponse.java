package com.eduale.bodega.controlador;

import com.eduale.bodega.modelo.Usuario;

import org.springframework.http.HttpStatus;

public class APIResponse {
	
	private Integer status;
	private Usuario usuario;
	private String data;
	private Object error;

	public APIResponse() {
		this.status = HttpStatus.OK.value();
		this.data = data;
		this.error = error;
		this.usuario = usuario;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
