package com.proyecto.service.impl;
import org.springframework.stereotype.Service;

import com.proyecto.modelo.Unidad;
import com.proyecto.repository.TropaRepository;
import com.proyecto.service.TropasService;



@Service
public class TropasServiceImpl implements TropasService {
	
	
	final TropaRepository tropaRepository;
	

	public TropasServiceImpl(TropaRepository tropaRepository) {
		this.tropaRepository = tropaRepository;
	}
		
	
	@Override
	public Iterable<Unidad> listarUnidades() {
		
		final Iterable<Unidad> unidades;
		
		unidades = tropaRepository.findAll();
		
	
			
		return unidades;
	}

}
