package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.proyecto.modelo.usuario.Lista;


	@Repository
public interface ListasRepository extends JpaRepository<Lista, Long> {

	}

