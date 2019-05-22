package com.proyecto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.exceptionscontrol.UnidadNotFoundException;
import com.proyecto.modelo.Unidad;
import com.proyecto.service.TropasService;

@RestController
@RequestMapping(value = "/principal", produces = "application/json")
public class ControladorPrincipal {

	@Autowired
	private TropasService servicio;

	@GetMapping(value = "/getall")
	public List<Unidad> getAll() {

		return servicio.listarUnidades();
	}

	@PostMapping(value = "/buscar")
	public Unidad getUnidad(@RequestParam("idUnidad") String idUnidad) {
		try {
			
			return servicio.getUnidad(Integer.parseInt(idUnidad));
		}catch(UnidadNotFoundException e) {
			e.getMessage();
			return null;
		}
		
	}

}