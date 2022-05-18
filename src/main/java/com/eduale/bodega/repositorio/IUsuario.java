package com.eduale.bodega.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.eduale.bodega.modelo.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long>{
	
	Usuario findByNicknameAndClave(String Nickname, String Clave );

}
