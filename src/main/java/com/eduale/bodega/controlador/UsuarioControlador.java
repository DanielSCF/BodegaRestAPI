package com.eduale.bodega.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping(path = "/{id}")
	public Optional<Usuario> buscarid(@PathVariable("id") Long id) {
		return usuarioService.buscarid(id);
	}
	 
	@PostMapping("/login")
	public ResponseEntity<APIResponse> login(@RequestBody Usuario loginRequestDTO){
	
		APIResponse apiResponse= usuarioService.login(loginRequestDTO);
		return ResponseEntity
				.status(apiResponse.getStatus())
				.body(apiResponse);
	}
	 
	@PostMapping
	public Usuario guardarusuario(@Valid @RequestBody Usuario t) {
		return usuarioService.guardarusuario(t);
	} 

	@PutMapping
	public Usuario editarUsuario(@Valid @RequestBody Usuario t) {
		return usuarioService.editarUsuario(t);	
	}

	@DeleteMapping
	public void eliminarUsuario(@Valid @RequestBody Usuario t) {
		usuarioService.eliminarUsuario(t);
	}
	 
}
