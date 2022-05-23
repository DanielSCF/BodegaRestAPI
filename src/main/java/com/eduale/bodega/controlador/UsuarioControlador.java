package com.eduale.bodega.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduale.bodega.modelo.LoginRequestDTO;
import com.eduale.bodega.modelo.Usuario;
import com.eduale.bodega.servicio.UsuarioServicio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServicio usuarioService;
	 
	@GetMapping
	public List<Usuario> listarusuario(){
		return usuarioService.listarusuario();
	}
	 
	@PostMapping("/login")
	public ResponseEntity<APIResponse> login(@RequestBody Usuario loginRequestDTO){
	
		APIResponse apiResponse= usuarioService.login(loginRequestDTO);
		return ResponseEntity
				.status(apiResponse.getStatus())
				.body(apiResponse);
	}
	 
	@PostMapping()
	public Usuario guardarusuario(@RequestBody Usuario t) {
		return usuarioService.guardarusuario(t);
	} 
	 
}
