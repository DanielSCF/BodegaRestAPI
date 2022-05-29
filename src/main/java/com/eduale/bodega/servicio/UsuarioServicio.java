package com.eduale.bodega.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.controlador.APIResponse;
import com.eduale.bodega.modelo.Usuario;
import com.eduale.bodega.repositorio.ICliente;
import com.eduale.bodega.repositorio.IUsuario;


@Service
public class UsuarioServicio{
	
	@Autowired
	private IUsuario datausuario;
	
	@Autowired
	private ICliente datacliente;
	
	
	public List<Usuario> listarusuario(){
		return(List<Usuario>) datausuario.findAll();

	}
	
	public Optional<Usuario> buscarid(Long id) {
		return datausuario.findById(id);
	}
	
	public Usuario guardarusuario(Usuario u) {
		datacliente.save(u.getCliente());
		return datausuario.save(u);
	}

	public Usuario editarUsuario(Usuario u){
		return datausuario.save(u);
	}

	public void eliminarUsuario(Usuario u){
		datausuario.delete(u);
	}

	public APIResponse login(Usuario i){
		
		APIResponse apiResponse= new APIResponse();
		Usuario us= datausuario.findByNicknameAndClave(i.getNickname(), i.getClave());
		
		if(us==null) {
			apiResponse.setData("Login Fallido");
		}else {
			apiResponse.setData("Bienvenido");
			apiResponse.setUsuario(us);
		}
		
		return apiResponse;
	}	
}
