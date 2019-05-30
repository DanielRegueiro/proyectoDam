package com.proyecto.service;




import com.proyecto.modelo.usuario.Usuario;

public interface UsuarioService  {
	Usuario findByNombre(String nombre);
	Usuario getUsuario(long id);
}
