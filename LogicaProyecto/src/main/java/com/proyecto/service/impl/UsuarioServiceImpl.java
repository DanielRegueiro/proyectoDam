package com.proyecto.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;


import com.proyecto.modelo.usuario.Usuario;
import com.proyecto.repository.UsuarioRepository;
import com.proyecto.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
UsuarioRepository usuarioRepository;

public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
	this.usuarioRepository = usuarioRepository;
}

	@Override
	public Usuario getUsuario(long id) {
		final Usuario updated;
		final Optional<Usuario> result = usuarioRepository.findById(id);
		
		if (!result.isPresent()) {
			return null;
		}
		updated = result.get();
		return updated;
	}

	@Override
	public Usuario findByNombre(String nombre) {
		 
			final Usuario updated;
			final Optional<Usuario> result = usuarioRepository.findByNombre(nombre);
			
			if (!result.isPresent()) {
				return null;
			}
			updated = result.get();
			return updated;
	}

	@Override
	public void setUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
		
	}

}
