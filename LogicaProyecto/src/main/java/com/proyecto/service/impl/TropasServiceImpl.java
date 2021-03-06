package com.proyecto.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.proyecto.modelo.Unidad;
import com.proyecto.repository.TropaRepository;
import com.proyecto.service.TropasService;

@Service
public class TropasServiceImpl implements TropasService {
	
	TropaRepository tropaRepository;

	public TropasServiceImpl(TropaRepository tropaRepository) {
		this.tropaRepository = tropaRepository;
	}

	@Override
	public List<Unidad> listarUnidades() {

		final List<Unidad> unidades;

		unidades = tropaRepository.findAll();
		
		return unidades;
	}

	@Override
	public Unidad getUnidad(long id) {
		final Unidad updated;
		final Optional<Unidad> result = tropaRepository.findById(id);
		if (!result.isPresent()) {
			return null;
		}
		updated = result.get();
		return updated;
	}

}
