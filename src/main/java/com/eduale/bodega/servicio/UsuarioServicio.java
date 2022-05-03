package com.eduale.bodega.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduale.bodega.controlador.APIResponse;
import com.eduale.bodega.modelo.LoginRequestDTO;
import com.eduale.bodega.modelo.Usuario;
import com.eduale.bodega.repositorio.IUsuario;




@Service
public class UsuarioServicio{
	
	@Autowired
	private IUsuario datausuario;
	
	
	public List<Usuario> listarusuario(){
		return(List<Usuario>) datausuario.findAll();

	}
	
	public Usuario guardarusuario(Usuario u) {
		return datausuario.save(u);
		
	}

	public APIResponse login(LoginRequestDTO loginRequestDTO) {
		APIResponse apiResponse = new APIResponse();
		
		Usuario user = datausuario.findOnebyNicknameIgnoreCaseAndClave(loginRequestDTO.getNickname(), loginRequestDTO.getClave());
		 
	   if(user == null){
	     apiResponse.setData("logeo fallido");
	            
	   }else {
		   apiResponse.setData("Bienvenido");
	   }
	   
		return apiResponse;
	}
	
	
	
}
