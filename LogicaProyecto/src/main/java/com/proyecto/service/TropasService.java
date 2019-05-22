package com.proyecto.service;



import java.util.List;

import com.proyecto.modelo.Unidad;

public interface TropasService {

	List<Unidad> listarUnidades();
	Unidad getUnidad(long id);
}