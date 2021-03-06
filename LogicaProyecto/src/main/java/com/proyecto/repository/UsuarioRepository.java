package com.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.proyecto.modelo.usuario.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	  Optional<Usuario> findByNombre(String nombre);
}
